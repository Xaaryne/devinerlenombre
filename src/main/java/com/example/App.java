package com.example;

import java.util.Scanner;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Je pense a un nombre entre 1 et 10. Devinez lequel");
        Random generateur = new Random();
        int chiffre = generateur.nextInt(10) + 1;
        int win = 0;
        int tentatives = 0;
        while (win != 1) {
            tentatives = tentatives + 1;
            System.out.println("Donnez un nombre entre 1 et 10");
            int chiffredonne = clavier.nextInt();
            int difference = chiffre - chiffredonne;
            int chiffrepluspetit = chiffredonne - chiffre;
            if (chiffredonne == chiffre) {
                System.out.println("Vous avez gagné !");
                System.out.println("Il vous a fallu " + tentatives + " tentatives");
                win = 1;
            } else if (chiffredonne > chiffre) {
                System.out.println("Perdu ! La bonne réponse était " + chiffre);
                System.out.println("Vous avez dépassé de " + chiffrepluspetit);
                win = 0;
            } else if (chiffredonne < chiffre) {
                System.out.println("Perdu ! La bonne réponse était " + chiffre);
                System.out.println("Il vous manquait " + difference);
                win = 0;
            }
        }
    }
}
