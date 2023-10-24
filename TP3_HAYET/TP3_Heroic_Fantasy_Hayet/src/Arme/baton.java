/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arme;

/**
 *
 * @author owenh
 */
public class baton extends Arme {
    int age;

    public baton(int age, String nom, int niveauAttaque) {
        super(nom, niveauAttaque);
        if ( age >=100){
        age = 1;
        this.age = age;
    }
        
}

    public int getAge() {
        return age;
    }
}
