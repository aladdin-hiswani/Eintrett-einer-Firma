
package ahprojekt001mitklassen1;

import java.util.Scanner;

public class GehaltBerechnen {
    public static String username;
    public static String arbeit;
    public static int wahl;
    public static int geburtsdatum;
    public static int alt;
    public static double gehalt;
    
    public static double netto;
    public static double überstunde;
    public static double zuschlag;
    public static boolean weiter = true;
    public static boolean weiter1 = true;
    public static boolean weiter2 = true;
    public static boolean weiter3 = true;
    
    public static Scanner input = new Scanner(System.in);   
    
    
    public double brutto; 
    
    public void setBrutto(double brutto){
        this.brutto = brutto; 
    }
    public double getBrutto (){
        return this.brutto; 
    }
    
    public void Gehalt (){
         System.out.println("Wie viele Überstunden haben Sie geleistet?");
                    überstunde = input.nextDouble();
                    
                    netto = ((brutto+(überstunde*20)) * 70) / 100;
                    
                    System.out.println("Herr " + Username.username + ", " + Username.alt + " Jahre alt, Wir freuen uns dass Sie da sind"
                + "\nSie Verdienen diesen Monat ein Gehalt von " + brutto + "€ Brutto, "
                + "\n nach Abzug aller Steuern bleiben Ihnen mit Überstunde " + netto + "€ Netto."
                + "\n Für die Steuern erheben wir pauschal 30%. "
                        + "\n -------------------------------------------------------"
                        + "\n");

    
    
            
    
    
    }
    
    
}
