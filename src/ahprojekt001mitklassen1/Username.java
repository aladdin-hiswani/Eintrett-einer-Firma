
package ahprojekt001mitklassen1;

import java.util.Scanner;

    public class Username {
    public static String username;
    public static String arbeit;
    public static int wahl;
    public static int geburtsdatum;
    public static int alt;   
    public static Scanner input = new Scanner(System.in);   
    
    
        public void benutzer (){
            System.out.println("Username: ");
           username = input.nextLine();
            System.out.println("Geburtsjahr: ");
            geburtsdatum = input.nextInt();
            alt = 2020 - geburtsdatum;

        System.out.println("Herzlich Wilkommen Herr " + username + ", sie sind " + alt + " Jahre alt.");
    
        }
    
    
    
    
    
    
    
}
