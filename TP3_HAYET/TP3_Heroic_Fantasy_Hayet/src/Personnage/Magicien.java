/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author owenh
 */
public class Magicien extends Personnage{
    boolean Conf;
     static int TotalM=0;
    public Magicien( String nom, int niveauDeVie,boolean Conf) {
        super(nom, niveauDeVie);
        this.Conf = Conf;
         TotalM++ ;      
    }
    public boolean isConfirme() {
        return Conf;
    }  
    

    public void setConfirme(boolean Conf) {
        this.Conf = Conf;
    }
    
    public static int getTotalM() {
        return TotalM;
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

 

    
