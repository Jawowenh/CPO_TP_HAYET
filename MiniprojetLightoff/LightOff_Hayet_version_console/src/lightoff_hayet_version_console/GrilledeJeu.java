/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_hayet_version_console;

import java.util.Random;

/**
 *
 * @author owenh
 */
public class GrilledeJeu {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    public GrilledeJeu(int x, int y) {
        this.nbLignes = x;
        this.nbColonnes = y;
        matriceCellules = new CelluleLumineuse[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
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
                nbLignes=5;
                nbColonnes=5;
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
    

       public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }
        public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][nbLignes - i - 1].activerCellule();
        }
    }
        
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }
   public boolean cellulesToutesEteintes() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            if (matriceCellules[i][j].etat) {
                return false; // Si une cellule est allumée, retourne false
            }
        }
    }
    return true; // Si aucune cellule n'est allumée, retourne true
}
   @Override
  public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("     | ");
        for (int j = 0; j < nbColonnes; j++) {
            sb.append(j).append(" | ");
        }
        sb.append("\n");

        for (int i = 0; i < nbLignes; i++) {
            sb.append("---------------------------------\n");
            sb.append(i).append("    | ");
            for (int j = 0; j < nbColonnes; j++) {
                sb.append(matriceCellules[i][j]).append(" | ");
            }
            sb.append("\n");
        }

        return sb.toString();
     
    }
}






        

