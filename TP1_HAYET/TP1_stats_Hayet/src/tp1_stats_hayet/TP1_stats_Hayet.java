/*
  * Nom: Hayet Owen
 *Groupe :TDC
 *Role: stats
 * date Septembre 2023
 */
package tp1_stats_hayet;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author owenh
 */
public class TP1_stats_Hayet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] tableauDes = new int[6]; // Crée un tableau de 6 entiers avec chaque cases égale à 0
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisissez un nombre entier x : ");
        int x = sc.nextInt(); // création de l'entier m par l'utilisateur
        Random generateurAleat = new Random();
        for (int i = 0 ; i < x ; i++){
            int n = generateurAleat.nextInt(5); // Génère un nombre aléatoire entre 0 et 5
            tableauDes[n]++; // Incrémente la case correspondant au résultat du lancer
        }
        System.out.println("Résultats des lancers en pourcentage :");
        for (int i = 0; i < tableauDes.length; i++) {
            double pourcentage = tableauDes[i] * 100 / x;
            System.out.println("Face " + (i + 1) + ": " + pourcentage + "%");
        }
    }
}
    
    

