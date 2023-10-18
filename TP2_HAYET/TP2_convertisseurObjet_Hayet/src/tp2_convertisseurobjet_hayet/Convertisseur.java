/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_hayet;


/**
 *
 * @author owenh
 */
public class Convertisseur {
   int nbConversions;
   
    public Convertisseur () {
     nbConversions = 0 ;
    }
public double CelsiusVersKelvin(double Celsius) {
       ++nbConversions;
        return Celsius + 273.15;
    }
    public double KelvinVersCelsius(double Kelvin) {       ++nbConversions;

      return Kelvin -273.15;
    }
    public double FarenheitVersCelsius(double Fahrenheit) {       ++nbConversions;

          return (Fahrenheit- 32.0) * 5.0/ 9.0;
    }

    public double CelsiusVersFarenheit(double Celsius) {       ++nbConversions;

        return (Celsius * 9.0/ 5.0) + 32.0;
    }

    public double KelvinVersFarenheit(double Kelvin) {
          double celcius ;
        celcius=KelvinVersCelsius(Kelvin);
        return CelsiusVersFarenheit(celcius);
    }
    public double FarenheitVersKelvin(double Fahrenheit) {
        double celsius ;
          celsius= FarenheitVersCelsius(Fahrenheit);
      return CelsiusVersKelvin(celsius);}
   @Override
public String toString () {
 return "nb de conversions " + nbConversions;
}}

 
    