package dev.wsem;

import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

/**
 * Classe principale de l'application.
 * Affiche un texte stylisé en ASCII Art grâce à la bibliothèque JFiglet.
 *
 * @author Wsem
 * @version 1.0
 */
public class App {

    /**
     * Méthode principale exécutée au lancement de l'application.
     *
     * @param args les arguments passés en ligne de commande
     * @throws IOException si une erreur d'entrée/sortie survient lors de la génération du texte ASCII
     */
    public static void main(String[] args) throws IOException {
        // Texte à afficher en ASCII art
        String message = "WSEM le Dr Computeur , Merci à SEGA ";

        // Conversion du message en ASCII art
        String asciiArt = FigletFont.convertOneLine(message);

        // Affichage dans la console
        System.out.println(asciiArt);
    }
}
