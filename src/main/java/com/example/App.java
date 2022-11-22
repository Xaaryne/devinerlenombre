package com.example;

import java.util.Scanner;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Je pense a un nombre entre 1 et 10. Devinez lequel");
        Random generateur = new Random();
        int chiffre = generateur.nextInt(10) + 1;
        System.out.println("Donnez un nombre entre 1 et 10");
        int chiffredonne = clavier.nextInt();
        int difference = chiffre - chiffredonne;
        int chiffrepluspetit = chiffredonne - chiffre;
        clavier.close();
        if (chiffredonne == chiffre) {
            System.out.println("Vous avez gagné !");
        } else if (chiffredonne > chiffre) {
            System.out.println("Perdu ! La bonne réponse était " + chiffre);
            System.out.println("Vous avez dépassé de " + chiffrepluspetit);
        } else if (chiffredonne < chiffre) {
            System.out.println("Perdu ! La bonne réponse était " + chiffre);
            System.out.println("Il vous manquait " + difference);
        }
    }

}
