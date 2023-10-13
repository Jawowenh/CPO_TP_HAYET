/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_hayet;

/**
 *
 * @author owenh
 */
public class Voiture {
    String M;
    String B;
    int C ;
    Personne proprietaire;
public Voiture(String modele, String marque, int puissance) {
    M= modele;
    B= marque;
    C= puissance ;
    proprietaire = null;
}


   @Override
public String toString () {
 return  M;
}}