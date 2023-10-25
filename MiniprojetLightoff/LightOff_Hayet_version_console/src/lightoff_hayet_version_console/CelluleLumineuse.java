/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_hayet_version_console;

/**
 *
 * @author owenh
 */
public class CelluleLumineuse {
boolean etat;

    /**
     *
    
     */
    public CelluleLumineuse() {
        this.etat = false;
    }
    
    /**
     *
     */
    public void activerCellule() {
        if (etat== false){
        this.etat = true;}
        else {
        this.etat=false;
                 }
    }        

    /**
     *
     */
    public void eteindreCellule() {
     etat=false;
 }
   
    /**
     *
     * @return
     */
    public boolean estEteint() {
          etat=false;
        return true;
    
    }

    /**
     *
     * @return
     */
    public boolean getEtat() {
        return etat;
    }

    @Override
    public String toString() {
        // Redéfinition de la méthode toString pour afficher l'état de la cellule
        return etat ? "X" : "O";
    }
}
