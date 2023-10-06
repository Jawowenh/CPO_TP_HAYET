/*
  * Nom: Hayet Owen
 *Groupe :TDC
 * Role: convertisseur
 * date Septembre 2023
 */
package tp1_convertisseur_hayet;

import java.util.Scanner;

/**
 *
 * @author owenh
 */
public class TP1_convertisseur_Hayet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp ;
        int convert;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur :");
        temp =sc.nextDouble();
        convert=sc.nextInt();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
    if ( convert == 1){
        System.out.println(+temp+  " degré celcius est égal à " +CelciusVersKelvin(temp)+ " Kelvin");
    }
     if ( convert == 2){
        System.out.println(+temp+" kelvin est égal à " +KelvinVersCelcius(temp)+ " degré celcius");
    }
      if ( convert == 3){
        System.out.println(  +temp+" degré farenheit est égal à " +FarenheitVersCelcius(temp)+ " degré celcius");
    }
       if ( convert == 4){
        System.out.println(  +temp+" degré celcius est égal à " +CelciusVersKelvin(temp)+ " degré farenheit");
    }
     if ( convert == 5){
        System.out.println(+temp+" kelvin est égal à " +CelciusVersKelvin(temp)+ " degré farenheit");
    }
      if ( convert == 6){
        System.out.println(+temp+" degré farenheit est égal à " +CelciusVersKelvin(temp)+ " Kelvin");
    }
    }
  
    
        
    public static double CelciusVersKelvin(double Celcius) {
        return Celcius + 273.15;
    }
    public static double KelvinVersCelcius(double Kelvin) {
      return Kelvin -273.15;
    }
    public static double FarenheitVersCelcius(double Fahrenheit) {
          return (Fahrenheit- 32.0) * 5.0/ 9.0;
    }

    public static double CelciusVersFarenheit(double Celcius) {
        return (Celcius * 9.0/ 5.0) + 32.0;
    }

    public static double KelvinVersFarenheit(double Kelvin) {
          double celcius ;
        celcius=KelvinVersCelcius(Kelvin);
        return CelciusVersFarenheit(celcius);
    }
    public static double FarenheitVersKelvin(double Fahrenheit) {
        double celcius ;
          celcius= FarenheitVersCelcius(Fahrenheit);
      return CelciusVersKelvin(celcius);}
}

        
    

