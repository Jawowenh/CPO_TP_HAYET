/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author owenh
 */
public class Guerrier extends Personnage {
    boolean aCheval;
        static int TotalG=0;

    public Guerrier(String nom, int niveauDeVie, boolean aCheval) {
        super(nom, niveauDeVie);
        this.aCheval = aCheval;
        TotalG++;
    }
    
   
    public static int getTotalG() {
        return TotalG;
    }

    public boolean isACheval() {
        return aCheval;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public void estvivant() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void estattaqué(int points) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

  
}
