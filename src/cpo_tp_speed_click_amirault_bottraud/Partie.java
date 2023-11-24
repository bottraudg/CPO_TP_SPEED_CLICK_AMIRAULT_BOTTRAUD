/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpo_tp_speed_click_amirault_bottraud;

import java.util.Scanner;

/**
 *
 * @author guilenebottraud
 */
public class Partie {

    int difficulte;
    Scanner scanner;
    String niveau;

    public Partie() {
        System.out.println("Bienvenue dans le jeu Speed Click!");
        scanner = new Scanner(System.in);
        while (difficulte == 0) {
            System.out.println("Choisisez un niveau ( facile/ moyen/ difficile ) : ");
            
            niveau = scanner.nextLine();
            int nbCellule = 0;

        }

    }
}
