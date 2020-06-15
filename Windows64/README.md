# Java-Wrapper für ViconDataStream

## Beschreibung
Dieses Projekt erzeugt einen Java Wrapper um die Vicon DataStream API unter `Windows 10 x64` mit `Visual Studio Community 2019 x64`.

## Benötigte Software
* `Windows 10 x64`
* `Visual Studio Community 2019 x64` (Version 2017 funktioniert nicht!)
* [(empfohlen) Git für Windows x64](https://git-scm.com/download/win)
* [(empfohlen) TortoiseGit x64](https://tortoisegit.org/download/)
* [Java JDK ab 11 LTS](https://www.oracle.com/java/technologies/javase-downloads.html)
* [SWIG für Windows (swigwin) 4.0.1](http://www.swig.org/download.html)
	* Entpacken an einen beliebigen Ort

## Notwendige lokale Anpassungen
* In die Systemvariable `PATH` den Pfad der SWIG Installation hinzufügen. (Z.B. `C:\Users\<username>\Desktop\Arbeit\swigwin-4.0.1`)
* Die Systemvariable `JAVA_HOME` so einrichten, damit diese auf die aktuelle Java Installation zeigt. (Z.B. `C:\Program Files\Java\jdk-14.0.1`)

## Dateien generieren
Projekt in `git pull`en.\
Mit Klick auf die `.sln` Datei im Projektverzeichnis unter `\Windows64\wrapper_dll_generator` in Visual Studio öffnen.

In der Menüleiste: `Build` > `Build Solution` erzeugt alle benötigten Dateien.\
Ein sauberer Rebuild ist möglich mit `Rebuild Solution`.\
Die Java Dateien befinden sich jetzt in `JViconDataStreamTest` und die `.dll` Datei in `\Windows64\wrapper_dll_generator\x64\Debug`.

