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
        operateur= sc.nextInt();
        if ( operateur<1 || operateur>5){
            System.out.println ("Please choose an other number ");
            System.exit(0);}
        
       System.out.println("\n Pleace choose the first number :");
        operande1 = sc.nextInt(); 
        System.out.println("\n Pleace choose the second number :");
        operande2 = sc.nextInt(); 
         
        if (operateur == 1) {
            System.out.println(operande1 + operande2);}
        if (operateur == 2) {
            System.out.println(operande1 - operande2);}
        if (operateur == 3) {
            System.out.println(operande1 * operande2);}
        if (operateur == 4) {
            System.out.println(operande1 / operande2);}
        if (operateur == 5) {
            System.out.println(operande1 % operande2);}
            
                    
        
        }}
    

