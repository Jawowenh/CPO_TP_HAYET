/*
 * Nom: Hayet Owen
 *Groupe :TDC
 * Role: guess my number
 * date Septembre 2023
 */
package tp1_guessmynumber_hayet;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author owenh
 */
public class TP1_guessMyNumber_HAYET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int choix;
        int level;
        int bornemax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez le niveau de difficulté que vous souhaitez effectuer :");
        System.out.println("1) Facile");
        System.out.println("2) Moyen");
        System.out.println("3) Difficile");
        level = sc.nextInt();
        if (level == 1) {  //chaque level correspond à un niveau. Ces niveaux sont différenciés par la borne du chiffre prix au hasard jusqu'à cette borne
            bornemax = 40;
        }
        if (level == 2) {
            bornemax = 70;
        }
        if (level == 3) {
            bornemax = 120;
        }

        int n = generateurAleat.nextInt(bornemax);
        System.out.println("Devinez le nombre qui est entre 0 et " + bornemax);
        System.out.println("Maintenant à votre tour, saisissez une valeur :");
        choix = sc.nextInt();
        int t = 0;
        while (choix != n) {
            if (choix < n) {
                System.out.println("Trop petit");
            }
            if (choix > n) {
                System.out.println("Trop grand");
            }
            t = t + 1;
            if (t > 10) {
                System.out.println("Vous avez perdu en atteignant le nombre maximum de tentatives");
            }
            System.out.println("Saisir une nouvelle valeur");
            choix = sc.nextInt();
        }

        if (choix == n) {
            System.out.println("Vous avez gagné en " + t + " tentatives");
        }
    }

}
