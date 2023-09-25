/*
 * Nom: Hayet Owen
 *Groupe :TDC
 * Role: Calculator
 * date Septembre 2023
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author owenh
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("""
                           Please enter the operators:
                           1)add
                           2)substract
                           3)multiply
                           4)divide
                           5)modulo
                           """);
        int operateur, operande1, operande2; 
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Pleace choose the foirst number :");
        operande1 = sc.nextInt(); 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n please choose the second number :");
        operande2 = sc.nextInt();
        
    }
    
}
