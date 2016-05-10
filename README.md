# ScrumProjekt
Projekt zur Erprobung agiler Methoden im Unterricht (SS2016)

Dieses Projekt entstand im Rahmen der Vorlesung "Didaktik der Informatik"
im Sommersemester 2016 an der Universität Osnabrück. Im Rahmen des Projekes
wurden agile Methoden der Softwareentwicklung für den Unterricht anhand
eines Greenfoot Projektes erprobt.

## Vorraussetzungen

- Installation von git auf dem eigenen Rechner
- Greenfoot Version 3.0.2 und aufwärts und das JDK

## Hinweise

Wichtig ist, dass eine Greenfoot Version verwendet wird, in der die Einträge in ```project.greenfoot```
in alphabetischer Reihenfolge gespeichert werden. Ansonsten kommt es in der Regel zu Konfilkten beim
Commit.

Die Teilnhemer müssen sich beim bearbeiten von Tasks Arbeiten an den folgenden Ablauf halten.

1. Aktuelle Version aus dem Repository holen (pull)
2. Bearbeiten/Testen der lokalen Version
3. Neue Dateien hinzufügen (add)
4. Commit der Änderungen mit Nachricht
5. Einspielen der Änderungen in das Repository (push)

## Anlegen einer lokalen Arbeitskopie (clone)

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
> ```git commit -m "Nachricht" <file>```

## Hochladen der Änderungen (push)

Der folgende Befehl lädt die bestätigten Änderungen in das Original-Repository zurück.
Die Änderungen werden in den Zweig ```<branch>``` eingefügt. Bei unserem Projekt in der
Regel ```master```.

> ```git push origin <branch>```


## Änderungen im Repository in die aktuelle Arbeitskopie einfügen

Falls während der Arbeit an der lokalen Kopie Änderungen im globalen Repository gemacht wurden, die
in die lokale Kopie übernommen werden sollen, kann man zuerst probieren, ob bei einem Pull ein Konflikt entsteht:

> ```git pull```

Wenn sich git weigert die Änderungen des Repositories einzuspielen, kann man die lokalen vorrübergehend
rückgängig machen (stashen), die lokale Arbeitskopie aktualisieren (pull) und die lokalen Änderungen wieder
einspielen (pop):

> ```git stash```

> ```git pull```

> ```git stash pop```

