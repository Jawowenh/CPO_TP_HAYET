/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_hayet;

import Personnage.Personnage;
import Personnage.*;
import Arme.*;
import java.util.ArrayList;

/**TP3
 *Heroic_fantasy
 * @author owenh
 * octobre 2023
 */
public class TP3_Heroic_Fantasy_Hayet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Epee Excalibur = new Epee(7,"Exacalibur", 5);  
    Epee Durandal = new Epee(4,"Durandal", 7);   
    baton Chene= new baton(4, "Chene", 5);
    baton Charme =new baton(5, "Charme", 6);

    System.out.println(Chene);
    ArrayList<Arme> armes = new ArrayList<>();
    armes.add(Excalibur);
    armes.add(Durandal);
    armes.add(Chene );
    armes.add(Charme);
    System.out.println(armes);
        System.out.println("Caractéristiques des armes :");
        for (int i = 0; i < armes.size(); i++) {
            System.out.println("Arme " + (i + 1) + ": " + armes.get(i));
        }
    Magicien garcimore = new Magicien("Garcimore", 44, false);
    Guerrier lannister = new Guerrier("Lannister", 45, true);

    ArrayList<Personnage> personnages = new ArrayList<>();
    personnages.add(garcimore);
    personnages.add(lannister);
       System.out.println(personnages);
        System.out.println("Caractéristiques des personnages :");
        for (int i = 0; i < personnages.size(); i++) {
            System.out.println("Personnage " + (i + 1) + ": " + personnages.get(i));
        }
        
           Magicien gandalf = new Magicien("Gandalf", 65, true);
      Guerrier conan = new Guerrier("Conan", 78, false);
    ArrayList<Personnage> team1 = new ArrayList<Personnage>();
     team1.add (gandalf);
     team1.add(conan);
    Epee lightsaberg = new Epee(25,"greenlightsaber",7) {};
    Epee lightsaberp = new Epee(4,"purplelightsaber", 22);
    Epee epee3 = new Epee(14,"Épée 3", 15);
    baton baton1 = new baton(25,"Bâton 1", 33);
    baton baton2 = new baton(12,"Bâton 2", 44);
    baton baton3 = new baton(75,"Bâton 3", 12);

        conan.ajouterArme(baton1);
        conan.ajouterArme(lightsaberg);
        conan.ajouterArme(lightsaberp);

        conan.equiperArme("Épée 1");

        gandalf.ajouterArme(baton2);
        gandalf.ajouterArme(baton3);
        gandalf.ajouterArme(epee3);

        System.out.println("Caractéristiques du Guerrier Conan :");
        System.out.println(conan);
        System.out.println();
        
        System.out.println("Caractéristiques du Magicien Gandalf :");
        System.out.println(gandalf);
        
        int nombreDeBatons = gandalf.CAP();
        System.out.println("Nombre de bâtons préférés du magicien : " + nombreDeBatons);

        
        
       Magicien jouelasecu = new Magicien("Merlin", 100, true);
    Guerrier vraibonhomme = new Guerrier("Aragorn", 140, false);

    System.out.println("Caractéristiques du magicien :");
    System.out.println(jouelasecu);
    
    System.out.println("Caractéristiques du guerrier :");
    System.out.println(vraibonhomme);
    
   ArrayList<Personnage> team2 = new ArrayList<Personnage>();
     team2.add (jouelasecu);
     team2.add(vraibonhomme);
   
System.out.println("Nombre de personnages créés : " + Personnage.getTotal());
System.out.println("Nombre de guerriers créés : " + Guerrier.getTotalG());
System.out.println("Nombre de magiciens créés : " + Magicien.getTotalM());


             vraibonhomme.seFatiguer();

             System.out.println("Caractéristiques de " + vraibonhomme.getNom() + " après s'être fatigué :");
          System.out.println(vraibonhomme);
           System.out.println(vraibonhomme.getNom() + " est-il toujours vivant ? " + vraibonhomme.estVivant());
  
         vraibonhomme.attaquer(jouelasecu);

        System.out.println("Caractéristiques de " + jouelasecu.getNom() + " après avoir été attaqué :");
        System.out.println(jouelasecu);
        
        Guerrier Tanjiro = new Guerrier("Lannister", 89,false);
        Magicien Gojo = new Magicien("Garcimore", 44,false);
        Gojo.ajouterArme(Chene);
        Gojo.equiperArme(Gojo.getInventaire().get(0).getNom());
        Tanjiro.ajouterArme(lightsaberp);
        Tanjiro.equiperArme(Tanjiro.getInventaire().get(0).getNom());
       
        Gojo.attaquer(Tanjiro);
        System.out.println(Tanjiro);
        System.out.println(Gojo);
       
        Tanjiro.attaquer(Gojo);
        System.out.println(Tanjiro);
        System.out.println(Gojo);
}}
