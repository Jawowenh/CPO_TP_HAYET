/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_hayet;

/**
 *
 * @author owenh
 */
public class Personne {
        String NF;
        String Prenom;
        Voiture[] liste_voitures;
        int nbVoitures;
public Personne(String nom_de_famille, String premier_prenom) {
     NF=nom_de_famille ;
     Prenom= premier_prenom;
     liste_voitures= new Voiture[3];
     nbVoitures=0;
}
public boolean ajouterVoiture(Voiture voiture_a_ajouter) {
    // Vérifie si la voiture a déjà un propriétaire
    if (voiture_a_ajouter.proprietaire != null) {
        System.out.println("Erreur : Cette voiture a déjà un propriétaire.");
        return false;
    }

    // Vérifie si la personne a déjà 3 voitures
    if (nbVoitures >= 3) {
        System.out.println("Erreur : Vous possédez déjà le maximum de voitures autorisées.");
        return false;
    }

    // Ajoute la référence de la voiture dans la prochaine case libre du tableau
    liste_voitures[nbVoitures] = voiture_a_ajouter;
    
    // Indique à la voiture que son propriétaire est la personne actuelle
    voiture_a_ajouter.proprietaire = this;

    // Incrémente le nombre de voitures possédées par la personne
    nbVoitures++;

    return true;
}



   @Override
public String toString () {
 return "on a " +liste_voitures;
}}
