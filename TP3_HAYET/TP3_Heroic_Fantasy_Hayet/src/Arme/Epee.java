/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author owenh
 */
public class Epee extends Arme{
    int finesse;

public Epee(int finesse, String nom, int niveauAttaque){
    super(nom, niveauAttaque);
    if (finesse>= 100){
           finesse= 54 ;
        this.finesse = finesse;
    }
 
}

    public int getFinesse() {
        return finesse;
    }
}