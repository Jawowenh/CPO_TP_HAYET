/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Arme.*;
import java.util.ArrayList;
import tp3_heroic_fantasy_hayet.etreVivant;

/**
 *
 * @author owenh
 */
public abstract class Personnage implements etreVivant {
    private String nom;
    private int niveauDeVie;
    ArrayList<Arme> inventaire =new ArrayList<>();
    Arme armeUse;
     static int Total = 0;
    
    public Personnage(String nom, int niveauDeVie) {
    this.nom = nom;
    this.niveauDeVie = niveauDeVie;
    inventaire = new ArrayList<Arme>();
    armeUse = null;
    Total++;
    }

    public static int getTotal() {
        return Total;
    }


    
    public void ajouterArme(Arme arme) {
     if (inventaire.size() < 5) {
            inventaire.add(arme);
        return;
        }
     
    }

    public ArrayList<Arme> getInventaire() {
        return inventaire;
    }
    
    
    
    public void equiperArme (String nomArme) {
        for (Arme arme : inventaire){
            if (arme.getNom().equals(nomArme)) {
                armeUse=arme;
           System.out.println("Arme équipée : " + arme.getNom());
             return;
            }}
        System.out.println("L'arme recherchée n'a pas été retrouvée ");
 
    }

    
   public int CAP(){

            int nb=0;
            Magicien Magicienbot = new Magicien("Mbot",0,false);
            Guerrier guerrierbot = new Guerrier("Gbot",0,false);
            baton batest = new baton(0,"essaiB",0);  
            Epee epetest = new Epee(0,"essaiEP",0);  
            if (this.getClass()== Magicienbot.getClass() ){
                for(int i = 0 ; i <this.inventaire.size() ; i++){
                    if (this.inventaire.get(i).getClass()== batest.getClass() ){
                        nb++;
                    }
                }
                }
            else{
                for(int i = 0 ; i < this.inventaire.size() ; i++){
                    if (this.inventaire.get(i).getClass()== epetest.getClass() ){

                        nb++;
                    }}
            }
            return nb;
    }
   
        public Arme getArmeUtiliser() {
        return armeUse;
    }
    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void seFatiguer() {
    niveauDeVie = niveauDeVie -10;
    if (niveauDeVie < 0) {
        niveauDeVie = 0; 
    }
    }
    public boolean estVivant() {
    return niveauDeVie > 0;
    }
    public void estAttaque(int points) {
    niveauDeVie =niveauDeVie - points;
    if (niveauDeVie < 0) {
        niveauDeVie = 0; 
    }
}
    /*
public void attaquer(Personnage cible) {
    int damage = this instanceof Magicien ? 20 : this instanceof Guerrier ? 30 : 0;

    cible.estAttaque(damage);
}
*/
   public void attaquer(Personnage cible) {
        int damage = this.getArmeUtiliser().getNiveauAttaque();
        if (this instanceof Guerrier && this.armeUse instanceof Epee) {
            Epee arme = (Epee) this.armeUse;
            damage = damage * arme.getFinesse();
        } else if (this instanceof Magicien && this.armeUse instanceof baton) {
            baton arme = (baton) this.armeUse;
            damage = damage * arme.getAge();
        }
        this.seFatiguer();
        if (cible instanceof Magicien) {
            Magicien target = (Magicien) cible;
            if (target.Conf == true) {
                damage = damage / 2;
            }
        }
        if (cible instanceof Guerrier) {
            Guerrier target = (Guerrier) cible;
            if (target.aCheval == true) {
                damage = damage / 2;
            }
        }

        cible.estattaqué(damage);
    }

    @Override
    public String toString() {
        String perso = "Nom : " + getNom() + ", Niveau de Vie : " + getNiveauDeVie();
        if (armeUse != null) {
            perso += ", Arme en Main : " + armeUse.getNom();
        }
        return perso;
    }
}