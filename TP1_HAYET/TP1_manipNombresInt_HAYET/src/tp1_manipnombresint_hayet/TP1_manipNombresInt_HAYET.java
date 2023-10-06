/*
 * Nom: Hayet Owen
 *Groupe :TDC
 * Role: manipNombresint
 * date Septembre 2023
 */
package tp1_manipnombresint_hayet;

import java.util.Scanner;

/**
 *
 * @author owenh
 */
public class TP1_manipNombresInt_HAYET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int operande1, operande2; 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Pleace choose the first number :");
        operande1 = sc.nextInt(); 
        System.out.println("\n Pleace choose the second number :");
        operande2 = sc.nextInt(); 
        int add, sous, mult, div, reste ;
        add = operande1 + operande2;
        sous = operande1 - operande2;
        mult = operande1 * operande2;
        div = operande1 / operande2;
        reste= operande1 % operande2;
       System.out.println("le resultat de l'addition est "  + add);
       System.out.println("le resultat de la soustraction est "  + sous);
       System.out.println("le resultat de la multiplication est "  + mult);
       System.out.println("le quotient entier de la division euclidienne est "  + div);
       System.out.println("le reste de la division euclidienne est "  + reste);
    }
    
}
