/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_hayet_version_console;

import java.util.Scanner;

/**
  * Classe représentant une partie du jeu LightOff.
 * @author owenh
 */
public class Partie {
    private GrilledeJeu grille;
    private int nbCoups;
   private int coupsMax = 0; // Le nombre de coups maximum autorisés
     private int niveau = 0; // Niveau de difficulté

    /**
     * Constructeur de la classe Partie.
     * @param nbLignes Le nombre de lignes de la grille.
     * @param nbColonnes Le nombre de colonnes de la grille.
     */
    public Partie(int nbLignes, int nbColonnes) {
           grille = new GrilledeJeu(nbLignes, nbColonnes);
        nbCoups = 0;
    }

    /**
       * Initialise une nouvelle partie en mélangeant la matrice de cellules 
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10); 
        nbCoups = 0;
    }
    
    /**
     * Lance la partie en permettant au joueur de choisir un niveau de difficulté.
     */
    public void LancerPartie(){
      
        Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenue et c'est l'heure de jouer à LightOff :");
        initialiserPartie();
    System.out.println("Choisissez un niveau de difficulté :");
    System.out.println("1) Hardcore (10 coups)");
    System.out.println("2) joeueurlambda (15 coups)");
    System.out.println("3) easyplayer (20 coups)");
    niveau = sc.nextInt();

    switch (niveau) {
        case 1:
            coupsMax = 10;
            break;
        case 2:
            coupsMax = 15;
            break;
        case 3:
            coupsMax = 20;
            break;
        default:
            System.out.println("Niveau de difficulté invalide. Utilisation du niveau difficile.");
            coupsMax = 10;
            break;
    }

        while (grille.cellulesToutesEteintes()== false && nbCoups<coupsMax) {
        System.out.println("A votre tour, choissisez qu'est-ce que vous voulez modifier:");
        System.out.println("1) Une Ligne");
        System.out.println("2) Une Colonne");
        System.out.println("3) Une diagonale Descendante");
        System.out.println("4) Une Diagonale Montante");
        System.out.println(grille);
            int modif =sc.nextInt();
        

       if ( modif == 1){
    System.out.println("Choissisez votre ligne à modifier");  
     int numL = sc.nextInt();
     grille.activerLigneDeCellules(numL);
     System.out.println(grille);
         nbCoups++;

         }
     else if ( modif == 2){
           System.out.println("Choissisez votre colonne à modifier");  
     int numC = sc.nextInt();
     grille.activerColonneDeCellules(numC);
     System.out.println(grille);
         nbCoups++;

    }
      else if ( modif == 3){
     grille.activerDiagonaleDescendante();
     System.out.println(grille);
         nbCoups++;

    }
     if ( modif == 4){
     grille.activerDiagonaleMontante();
     nbCoups++;
     
     }}
      if (nbCoups >= coupsMax) {
        System.out.println("Nombre maximum de coups atteint. Vous avez perdu.");
    } else {
        System.out.println("Toutes les cellules ont été éteintes en " + nbCoups + " coups. Vous avez gagné !");
    }



        }}
