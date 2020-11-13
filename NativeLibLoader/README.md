# Dokumentation für Benutzer

## Aufrufendes Projekt konfigurieren
In pom.xml hinzufügen:

        <dependency>
            <groupId>de.dhbw.rahmlab</groupId>
            <artifactId>NativeLibLoader</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
Notwendiger Methodenaufruf:

    de.dhbw.rahmlab.nativelibloader.api.NativeLibLoader.load(...)


Falls man das Quelltextprojekt benutzt und das Laden des JARs debuggen möchte:
In Netbeans "compile on save" deaktiveren. ->Siehe [StackOverflow Frage](https://web.archive.org/web/20201113173334/https://stackoverflow.com/questions/1304149/disabling-automatic-build-in-netbeans/1313691#1313691)
Netbeans gibt sonst im Run Output folgenden Hinweis:
> Running NetBeans Compile On Save execution. Phase execution is skipped
> and output directories of dependency projects (with Compile on Save
> turned on) will be used instead of their jar artifacts.

Das verhindert folgenden Fehler:

> Exception in thread "main" java.lang.UnsatisfiedLinkError: Can't load
> library:
> `<path to project>`/`<project name>`/natives/linux-amd64/libgluegen_rt.so

Die Ursache ist, dass Netbeans standardmäßig ("compile on save" aktiviert) die .class Dateien einer Dependency lädt, sofern die Dependency ein Netbeans Projekt ist. Mit der Deaktivierung dieser Funktion wird die JAR benutzt. Allerdings muss man darauf achten, dass das JAR Artefakt des NativeLibLoader Projekts erstellt worden ist.
