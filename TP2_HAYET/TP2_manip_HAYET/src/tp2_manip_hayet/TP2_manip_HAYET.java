/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_hayet;

/**
 *
 * @author owenh
 */
public class TP2_manip_HAYET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Tartiflette assiette1 = new Tartiflette(500) ;
    Tartiflette assiette2 = new Tartiflette(600) ;    
    Tartiflette assiette3 = assiette2 ; 
    // On a réellement créer eux tartilette car en réalité la troisième corresponds à la création de l'objet de la deuxième soit on a deux new et pas trois.
    //  Donc 2 et 3 réfèrent la même tartiflette
   
    System.out.println("nb de calories de l'Assiette 3: "+ assiette2.nbCalories);
    System.out.println("nb de calories de l'Assiette 2: "+ assiette2.nbCalories);
    assiette2.nbCalories=999;
    System.out.println("nb de calories de l'Assiette 3: "+ assiette2.nbCalories);
    System.out.println("nb de calories de l'Assiette 2: "+ assiette2.nbCalories);
    
    
    Tartiflette autreassiette= assiette1;
    assiette1= assiette2;
    assiette2=autreassiette;
    System.out.println("nb de calories de l'Assiette 1: "+ assiette1.nbCalories);
    System.out.println("nb de calories de l'Assiette 2: "+ assiette2.nbCalories);
    /*
    Moussaka assiette666 = assiette1 ;
    Moussaka assiette667 = new Tartiflette() ;
    */
   //les deux lignes ne sont pas corrects. la première ne l'est pas car assiette est l'attribut de tartiflette. La deuxième ne l'eest pas car elle réfèrence un objet Moussaka à partir de Tartiflette.
   //Donc cela nous montre que les références objets apparttiennent donc à deux classes différentes
   
   
   Moussaka[] tmouss = new Moussaka[10];
   for (int i = 0; i<10;i++){
       tmouss[i]= new Moussaka(i);
   }
   //oui, un objet peut contenir une référence vers un autre objet.
    
    
    }
    
 }
