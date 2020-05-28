# Beschreibung
Dieses Projekt erzeugt einen Java Wrapper um die Vicon DataStream API.

# Software
* Windows 10 x64
* Visual Studio Community 2019 x64 (Version 2017 does not work)
* [(empfohlen) Git für Windows x64](https://git-scm.com/download/win)
* [(empfohlen) TortoiseGit x64](https://tortoisegit.org/download/)
* [Java JDK 14.0.1 für Windows x64](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html)
* [SWIG für Windows (swigwin) 4.0.1](http://www.swig.org/download.html)
	* Entpacken an einen beliebigen Ort

# Notwendige lokale Anpassungen
* In die Systemvariable `PATH` den Pfad der SWIG Installation hinzufügen. (Z.B. `C:\Users\<username>\Desktop\Arbeit\swigwin-4.0.1`)

# Dateien generieren
Projekt in git pullen.\
Mit Klick auf die `[...].sln` Datei im Projektverzeichnis Visual Studio öffnen.

In der Menüleitste: `Build` > `Build Solution` erzeugt alle benötigten Dateien.\
Ein sauberer Rebuild ist möglich mit `Rebuild Solution`.

> Anmerkung: Dafür müssen in den `Properties` der `[...].i` Datei in `Outputs` dieselben Pfade wie in `Command Line` übergeben, angeben sein.

> Alternativ kann man `Local Windows Debugger` ausführen. Daraufhin wird jedoch die Fehlermeldung `Unable to start program [...].dll` angezeigt. Diese kann man aber ignorieren. Das heißt nur, dass der Debugger die dll nicht ausführen kann und hat nichts damit zu tun, ob alles korrekt gebaut wurde.

Die gewünschten Dateien befinden sich jetzt in den Verzeichnissen {`java_class_generated`, `x64/Debug`}.

