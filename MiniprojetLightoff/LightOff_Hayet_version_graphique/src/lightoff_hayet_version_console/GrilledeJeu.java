/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_hayet_version_console;

import java.util.Random;

/**
  * Classe représentant une grille de jeu composée de cellules lumineuses.
 * @author owenh
 */
public class GrilledeJeu {
     CelluleLumineuses[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /** 
     * Constructeur de la classe GrilledeJeu.
     * Initialise une grille de jeu avec le nombre de lignes et de colonnes spécifié,et initialise chaque cellule à l'état initial "Éteinte".
     * @param x Le nombre de lignes de la grille.
     * @param y Le nombre de colonnes de la grille.
     */
    public GrilledeJeu(int x, int y) {
        this.nbLignes = x;
        this.nbColonnes = y;
        matriceCellules = new CelluleLumineuses[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matriceCellules[i][j] = new CelluleLumineuses();
            }
        }
    }

    /**
       * Méthode pour éteindre toutes les cellules de la grille.
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
         * Méthode pour activer aléatoirement une ligne, une colonne ou une diagonale de cellules.
       * Choix aléatoire parmi les trois options possibles.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
          Random random = new Random();
           int choix = random.nextInt(3);
        if ( choix ==0){
                int ligneAleatoire = random.nextInt(nbLignes);
                this.activerLigneDeCellules(ligneAleatoire);  
        }
             if ( choix==1){
         int colonneAléatoire=random.nextInt(nbColonnes);
            this.activerColonneDeCellules(colonneAléatoire);
           }
         if ( choix ==2){
              int ligneAleatoire = random.nextInt(nbLignes);
                this.activerDiagonaleDescendante() ;  
            }else {
                  int ligneAleatoire = random.nextInt(nbLignes);
                this.activerDiagonaleMontante() ;   
                    }
     }
    

    /**
     *
     * @param nbTours
     */
    public void melangerMatriceAleatoirement(int nbTours) {
             
        eteindreToutesLesCellules();
        
        Random random = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int Alea = random.nextInt(3);

            if (Alea == 0) {
                int ligneAleatoire = random.nextInt(nbLignes);
                activerLigneDeCellules(ligneAleatoire);
            } else if (Alea == 1) {
                // Activer une colonne au hasard
                int colonneAleatoire = random.nextInt(nbColonnes);
                activerColonneDeCellules(colonneAleatoire);
            } else {
                // Activer une diagonale au hasard (descendante ou montante)
                int choixDiagonale = random.nextInt(2);
                if (choixDiagonale == 0) {
                    activerDiagonaleDescendante();
                } else {
                    activerDiagonaleMontante();
                }
            }
        }
    }
    
    /**
     * Méthode pour activer toutes les cellules d'une ligne spécifique.
 * @param idLigne L'index de la ligne à activer. *
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /**
      * Méthode pour activer toutes les cellules d'une colonne spécifique.
          * @param idColonne L'index de la colonne à activer.
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     * Méthode pour activer une diagonale montante (de gauche à droite) de cellules.
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][nbLignes - i - 1].activerCellule();
        }
    }
        
    /**
     * Méthode pour activer une diagonale descendante (de gauche à droite) de cellules.
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
    * Méthode pour vérifier si toutes les cellules de la grille sont éteintes.
     * @return true si toutes les cellules sont éteintes, sinon false.
     */
    public boolean cellulesToutesEteintes() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            if (matriceCellules[i][j].getEtat() != 1) {
                return false; // Si une cellule n'est pas allumée, retourne false
            }
        }
    }
    return true; // Si toutes les cellules sont allumées, retourne true
}

     /**
     * Redéfinition de la méthode toString pour afficher l'état de chaque cellule de la grille.
     * @return Une représentation sous forme de chaîne de caractères de la grille et de l'état de ses cellules.
     */
    @Override
  public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("     | ");
        for (int j = 0; j < nbColonnes; j++) {
            sb.append(j).append(" | ");
        }
        sb.append("\n");

        for (int i = 0; i < nbLignes; i++) {
            sb.append("--------------------------------------------------------\n");
            sb.append(i).append("    | ");
            for (int j = 0; j < nbColonnes; j++) {
                sb.append(matriceCellules[i][j]).append(" | ");
            }
            sb.append("\n");
        }

        return sb.toString();
     
    }
}






        

