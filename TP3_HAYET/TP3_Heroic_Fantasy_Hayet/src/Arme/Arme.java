/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author owenh
 */
public abstract class Arme {
    private String nom;
     private int niveauAttaque;
   public Arme(String nom, int niveauAttaque) {
       if (niveauAttaque>= 100){
           niveauAttaque= 9 ;}
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }
    public int getNiveauAttaque() {
        return niveauAttaque;
    }
    public String getNom() {
        return nom;
    }
    @Override
    public String toString() {
        return "Arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }

}
   
