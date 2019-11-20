# Projet UV DSL/Langages dédiés 

Ce projet a été realisé dans l'UV DSL/Langages dédiés dirigé par Massimo Tisi de l'IMT Atlantique.

L'équipe est formé d'Alexis Delforges et Lucas Taillebourg en FILA3.

L'objectif du projet est décrit dans le fichier "browerautomation.pdf" en racine de ce dossier.

## Xtend & Xtext projet : 
org.xtext.imt.browserautomationselenium

### Parsing
Pour lancer le projet, il faut une version modelling project d'Eclipse. Il faudra ensuite faire un clic droit sur le fichier BrowserAutomation.xtext et generate Xtext Artifact.

### Compilation
Pour tester la compilation et le parsing, il faudra faire clic droit sur le projet, run as eclipse application, et ouvrir le projet java où sont écris les tests dans le langage DSL (extension .ba) 

## DSL projet :
com.example.browerautomation

Dans ce projet vous trouverez les fichiers .ba qui correspondent à notre DSL. Une modification de l'un d'eux entrainera une génération du test.java correspondant.
Dans les fichiers .ba, le nom des tests devra être IMPERATIVEMENT débuté par une majuscule pour être considéré comme une classe java par IntelliJ et runnable par JUnit.

Une version déjà généré des tests se trouve dans le dossier DSL_GENERATED.

## Runner de test :

Veuillez trouvez le pom.xml en racine de ce dossier pour toutes les dépendances pour faire tourner les tests (IntelliJ UltimateEdition 2019.2.3)

Normalement, il va aussi falloir installer gecko pour faire tourner le driver selenium firefox.

## Github

Lien du github

https://github.com/Pourfex/DSL_Selenium
