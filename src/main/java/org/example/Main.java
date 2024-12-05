package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Création de l'EventManager
        EventManager manager = new EventManager();

        IObserver console = new ConsoleObserver();
        IObserver file = new FileObserver("register.log");


        manager.subscribe(console);
        manager.subscribe(file);


        manager.notify("Test de notification 1");
        manager.notify("Test de notification 2");

        manager.unsubscribe(console);

        manager.notify("Console unsubscribed");
        manager.notify("Test de notification 4");
    }
}


/*
Exercice : Observer - Notifications d'événements
Objectif :
Utilisez le pattern Observer pour créer un système de notification d'événements.
1. Implémentez une classe `EventManager` comme sujet, permettant d'ajouter et de notifier des observateurs.
2. Implémentez plusieurs observateurs, chacun ayant une réaction spécifique à une notification.
3. Testez en simulant des événements dans une classe principale. ( écrire un message console + écrire message dans un fichier)

 */