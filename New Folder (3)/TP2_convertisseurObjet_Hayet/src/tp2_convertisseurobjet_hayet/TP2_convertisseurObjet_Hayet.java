/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_hayet;

import java.util.Scanner;


/**
 *
 * @author owenh
 */
public class TP2_convertisseurObjet_Hayet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    Convertisseur convertisseur1 = new Convertisseur();
    Convertisseur convertisseur2 = new Convertisseur();
    double celsius1 = 25.0;
    double celsius2= 32.0;
    double kelvin= convertisseur1.CelsiusVersKelvin(celsius1);
    double fahrenheit = convertisseur2.CelsiusVersFarenheit(  celsius2);

    System.out.println(celsius1 + " degrés Celsius équivaut à " +kelvin + " degrés Fahrenheit");
      System.out.println(celsius2 + " degrés Celsius équivaut à " + fahrenheit + " degrés Fahrenheit");

    double kelvin1 = 77.0;
    double fahrenheit1 = 98.6;
    double celsius3 = convertisseur1.KelvinVersCelsius(kelvin1);
    double celsius4 = convertisseur2.FarenheitVersCelsius(fahrenheit1);

        System.out.println(kelvin1 + " degrés Fahrenheit équivaut à " + celsius3 + " degrés Celsius");
        System.out.println(fahrenheit1 + " degrés Fahrenheit équivaut à " + celsius4 + " degrés Celsius");

        System.out.println("Nombre de conversions effectuées par convertisseur1 : " + convertisseur1);
        System.out.println("Nombre de conversions effectuées par convertisseur2 : " + convertisseur2);
        
    
    Convertisseur convertchoix = new Convertisseur();
      double temp ;
        int convert;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        temp =sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        convert=sc.nextInt();
    if ( convert == 1){
        System.out.println(+temp+  " degré celcius est égal à " +convertchoix.CelsiusVersKelvin(temp)+ " Kelvin");
    }
     if ( convert == 2){
        System.out.println(+temp+" kelvin est égal à " +convertchoix.KelvinVersCelsius(temp)+ " degré celcius");
    }
      if ( convert == 3){
        System.out.println(  +temp+" degré farenheit est égal à " +convertchoix.FarenheitVersCelsius(temp)+ " degré celcius");
    }
       if ( convert == 4){
        System.out.println(  +temp+" degré celcius est égal à " +convertchoix.CelsiusVersFarenheit(temp)+ " degré farenheit");
    }
     if ( convert == 5){
        System.out.println(+temp+" kelvin est égal à " +convertchoix.KelvinVersFarenheit(temp)+ " degré farenheit");
    }
      if ( convert == 6){
        System.out.println(+temp+" degré farenheit est égal à " +convertchoix.FarenheitVersKelvin(temp)+ " Kelvin");

      }
      System.out.println(convertchoix);
    }
}