package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileObserver implements IObserver {
    private final String filePath;

    public FileObserver(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void update(String message) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(message + "\n");
            System.out.println("Écriture effectué dans " + filePath);
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }
}

