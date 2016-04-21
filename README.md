# ScrumProjekt
Projekt zur Erprobung agiler Methoden im Unterricht (SS2016)

Dieses Projekt entstand im Rahmen der Vorlesung "Didaktik der Informatik"
im Sommersemester 2016 an der Universität Osnabrück. Im Rahmen des Projekes
wurden agile Methoden der Softwareentwicklung für den Unterricht anhand
eines Greenfoot Projektes erprobt.

## Vorraussetzungen

- Installation von git auf dem eigenen Rechner
- Greenfoot und das JDK

## Anlegen eine lokalen Arbeitskopie (clone)

Mit dem folgenden Befehl legen Sie eine lokale Arbeitskopie des Repositories an:

> ```git clone https://github.com/mbrinkmeier/ScrumProjekt.git <directory>```

Die Arbeitskopie wird in ```<directory>``` angelegt.

## Aktualisieren der lokalen Arbeitskopie (pull)

Mit dem folgenden Befehl wird das lokale Repository aktualisiert:

> ```git pull```

## Lokale Datei hinzufügen und bestätigen (add & commit)

Mit dem folgenden Befehl wird <file> zum Projekt hinzugefügt:
> ```git add <file>```

Anschließend muüssen alle Änderungen bestätigt werden (auch bei bereits bestehenden Dateien)
> ```git commit -m "Nachricht"```

## Hochladen der Änderungen (push)

Der folgende Befehl lädt die bestätigten Änderungen in das Original-Repository zurück.
Die Änderungen werden in den Zweig ```<branch>``` eingefügt. Bei unserem Projekt in der
Regel ```master```.

> ```git push origin <branch>```
