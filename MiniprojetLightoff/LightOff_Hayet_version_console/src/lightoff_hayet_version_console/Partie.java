/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_hayet_version_console;

import java.util.Scanner;

/**
 *
 * @author owenh
 */
public class Partie {
    private GrilledeJeu grille;
    private int nbCoups;

    public Partie(int nbLignes, int nbColonnes) {
        grille = new GrilledeJeu(nbLignes, nbColonnes);
        nbCoups = 0;
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10); 
        nbCoups = 0;
    }
    public void LancerPartie(){
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue et c'est l'heure de jouer à LightOff :");
        initialiserPartie();
     

        while (grille.cellulesToutesEteintes()== false) {
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
     System.out.println(grille);    }
    nbCoups++;
    }
}


}
