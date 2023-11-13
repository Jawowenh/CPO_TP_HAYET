/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_hayet_version_console;

/**
 *
 * @author owenh
 */
public class LightOff_Hayet_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuses cellule1 = new CelluleLumineuses();
        System.out.println("État initial de la cellule 1 : " + cellule1);

        cellule1.activerCellule();
        System.out.println("Après activation de la cellule 1 : " + cellule1);

        cellule1.eteindreCellule();
        System.out.println("Après extinction de la cellule 1 : " + cellule1);

        CelluleLumineuses cellule2 = new CelluleLumineuses();
        System.out.println("État initial de la cellule 2 : " + cellule2);

        cellule2.activerCellule();
        System.out.println("Après activation de la cellule 2 : " + cellule2);

        if (cellule2.estEteint()) {
            System.out.println("La cellule 2 est éteinte.");
        } else {
            System.out.println("La cellule 2 est allumée.");    }
    
      Partie objet = new Partie(8,8);
      objet.initialiserPartie();
      objet.LancerPartie();
    }

}
