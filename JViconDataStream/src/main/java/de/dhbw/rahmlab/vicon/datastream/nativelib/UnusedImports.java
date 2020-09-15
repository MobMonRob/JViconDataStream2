/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.rahmlab.vicon.datastream.nativelib;

import com.thoughtworks.qdox.JavaProjectBuilder;
import com.thoughtworks.qdox.model.JavaClass;
import com.thoughtworks.qdox.model.impl.DefaultJavaClass;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Der Sinn dieser Klasse ist es, automatisiert herauszufinden, welche Klassen
 * tatsächlich verwendet werden.
 *
 * @author fabian
 */
public class UnusedImports {

	public static void start() {
		List<JavaClass> allClasses = get_AllClasses("/home/fabian/Schreibtisch/JViconDataStream2/JViconDataStream/src/main/java/");
		List<String> firstImports = get_firstImports(allClasses, "JViconDataStreamBundleInfo");
		allClasses = allClasses
			.stream()
			.filter(cl -> !cl.getCanonicalName().startsWith("de.dhbw."))
			.collect(Collectors.toCollection(ArrayList::new));

		Map<String, JavaClass> allNamesAndClasses = get_nameToClass(allClasses);

		Set<String> usedImports = get_usedImports(allNamesAndClasses, firstImports);
		List<String> unusedImports = get_unusedImports(allClasses, usedImports);

		unusedImports.forEach(s -> System.out.println(s));
	}

	private static List<String> get_firstImports(List<JavaClass> allClasses, String startClass) {
		List<JavaClass> bundleInfos = allClasses
			.stream()
			.filter(cl -> cl.getCanonicalName()
			.contains(startClass))
			.collect(Collectors.toCollection(ArrayList::new));

		assert bundleInfos.size() == 1;
		JavaClass bundleInfo = bundleInfos.get(0);

		List<String> firstImports = bundleInfo
			.getSource()
			.getImports()
			.stream()
			.filter(s -> !s.startsWith("java"))
			.collect(Collectors.toCollection(ArrayList::new));

		return firstImports;
	}

	private static List<String> get_unusedImports(List<JavaClass> allClasses, Set<String> usedImports) {
		List<String> allNames = allClasses
			.stream() //List<JavaClass>
			.map(cl -> cl.getSource().getImports()) //List<List<String>>
			.reduce(new ArrayList(), (sumList, importsList) -> listConcat(sumList, importsList)); //List<String>

		Set<String> filteredNames = allNames
			.stream()
			.filter(s -> !s.startsWith("java")) //List<String>
			.collect(Collectors.toCollection(HashSet::new));
		filteredNames.removeAll(usedImports);

		List<String> sortedNormedFilteredNames = filteredNames
			.stream()
			.map(s -> normImport(s)) //List<String>
			.sorted()
			.collect(Collectors.toCollection(ArrayList::new));

		return sortedNormedFilteredNames;
	}

	private static String normImport(String importString) {
		if (importString.startsWith("static ")) {
			return importString.substring(7);
		}

		return importString;
	}

	private static Set<String> get_usedImports(Map<String, JavaClass> allNamesAndClasses, List<String> firstImports) {
		Set<String> newImports = new HashSet();
		Set<String> processedImports = new HashSet();

		newImports.addAll(firstImports);

		while (!processedImports.containsAll(newImports)) {
			processedImports.addAll(newImports); //Passt so. Ich will ja nur wissen, welche es gibt.

			List<String> currentImports = newImports
				.stream() //List<String>
				.map(importString -> allNamesAndClasses.getOrDefault(importString, new DefaultJavaClass("empty"))) //List<JavaClass>
				.map(cl -> cl.getSource()) //List<List<JavaSource>>
				.filter(Objects::nonNull)
				.map(src -> src.getImports()) //List<List<String>>
				.reduce(new ArrayList(), (sumList, importsList) -> listConcat(sumList, importsList)); //List<String>

			newImports = currentImports //filtered
				.stream() //List<String>
				.map(s -> normImport(s)) //List<String>
				.filter(s -> !s.startsWith("java")) //List<String>
				.collect(Collectors.toCollection(HashSet::new));
		}

		return processedImports;
	}

	private static <T> List<T> listConcat(List<T> sumList, List<T> itemList) {
		sumList.addAll(itemList);

		return sumList;
	}

	private static List<JavaClass> get_AllClasses(String fileFullPath) {
		JavaProjectBuilder builder = new JavaProjectBuilder();
		builder.addSourceTree(new File(fileFullPath));

		List<List<JavaClass>> classesListSquared = builder
			.getSources() //<List<JavaSource>>
			.stream()
			.map(src -> src.getClasses()) //List<List<JavaClass>>
			.collect(Collectors.toCollection(ArrayList::new));

		List<JavaClass> classesList = classesListSquared
			.stream()
			.reduce(new ArrayList(), (sumList, javaClassList) -> listConcat(sumList, javaClassList));

		return classesList;
	}

	private static Map<String, JavaClass> get_nameToClass(List<JavaClass> allClasses) {
		HashMap<String, JavaClass> nameToClass = new HashMap();

		List<String> allClassesNames = allClasses
			.stream()
			.map(cl -> cl.getCanonicalName())
			.collect(Collectors.toCollection(ArrayList::new));

		assert allClasses.size() == allClassesNames.size();

		for (int i = 0; i < allClasses.size(); ++i) {
			nameToClass.put(allClassesNames.get(i), allClasses.get(i));
		}

		return nameToClass;
	}
}
