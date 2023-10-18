/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_haye;

/**
 *
 * @author owenh
 */
public class TP2_Bieres_HAYE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
BouteilleBiere uneBiere= new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson", false);
uneBiere.decapsuler();
uneBiere.decapsuler();
BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe", true) ;
autreBiere.decapsuler();
autreBiere.decapsuler();
System.out.println(uneBiere) ;
System.out.println(autreBiere);
    }
   
}
