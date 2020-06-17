# Java API für ViconDataStream (aufbauend auf dem JAVA-Wrapper)

## Beschreibung
Dieses Projekt liefert eine "schöne" Java API um den generierten ViconDataStream API Wrapper.\
Außerdem gibt es Tests.

## Benötigte Software
#### Für Windows
* `Windows 10 x64`
* [Java JDK ab 11 LTS](https://www.oracle.com/java/technologies/javase-downloads.html)
* [Apache NetBeans 12.0 LTS](https://netbeans.apache.org/download/nb120/nb120.html)
#### Für Linux
* `Ubuntu 18.04 x64`
* [Java JDK ab 11 LTS](https://www.oracle.com/java/technologies/javase-downloads.html)
* [Apache NetBeans 12.0 LTS](https://netbeans.apache.org/download/nb120/nb120.html)

## Notwendige lokale Anpassungen
#### Für Windows
In die Systemvariable `PATH` jeweils den Pfad der generierten Wrapper `.dll` und des Vicon DataStreamSDKs hinzufügen.\
Erstere befindet sich nach einem Generierungsvorgang im Projektverzeichnis unter `\Windows64\wrapper_dll_generator\x64\Debug`.\
Zweiteres befindet sich in Projektverzeichnis unter `\Windows64\DataStreamSDK_1.10`.\
Dadurch werden diese Pfade zu den `.dll`s Apache NetBeans über die Variable `java.library.path` bekannt gemacht.\
Um die Änderungen zu übernehmen, muss Apache NetBeans neu gestartet werden.

#### Für Linux
In die Systemvariable `PATH` jeweils den Pfad der generierten Wrapper `.so` und des Vicon DataStreamSDKs hinzufügen.\
Erstere befindet befindet sich nach einem Generierungsvorgang im Projektverzeichnis unter `/Linux64/`.\
Zweiteres befindet sich in Projektverzeichnis unter `\Linux64\DataStreamSDK_1.10`.\
Der Systemvariable `PATH` einen Pfad hinzufügen geschieht indem man der `~/.bashrc` die Zeile `export PATH=$PATH:<Pfad zur .so>` hinzufügt.
Dadurch wird der Pfad, in der die `.so` liegt Apache NetBeans über die Variable `java.library.path` bekannt gemacht. \
Um die Änderungen zu übernehmen, muss Apache NetBeans neu gestartet werden.

## Anmerkungen
* Java Dateien mit der Bezeichnung `SWIGTYPE[...].java` sind Fehler, da nur leere Klassenstummel!
    Per `Find usages` in Netbeans kann man sehr schnell herausfinden, welche Klasse diese Datei benötigt und dann auch, wie man per SWIG `%rename` den Fehler beheben kann.
* Wenn Netbeans die generierten Java Dateien ignoriert: Innerhalb der IDE `git` foglendermaßen deaktivieren: `Tools -> Plugins -> Installed -> Show Details` `Git` auswählen und auf  `Disable` klicken.
