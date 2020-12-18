package ahprojekt001mitklassen1;

import java.util.Scanner;

public class AHProjekt001MitKlassen1 {

    public static String username;
    public static String arbeit;
    public static int wahl;
    public static int geburtsdatum;
    public static int alt;
    public static double gehalt;
    public static double brutto;
    public static double netto;
    public static double überstunde;
    public static double zuschlag;
    public static boolean weiter = true;
    public static boolean weiter1 = true;
    public static boolean weiter2 = true;
    public static boolean weiter3 = true;

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Username benutzer = new Username();
        benutzer.benutzer();

        System.out.println("------------------------------------------------");
        HauptMenu();

    }

    public static void HauptMenu() {

        do {
            System.out.println("****************************************"
                    + "\nHerr " + Username.username + " wählen Sie bitte aus: "
                    + "\n****************************************"
                    + "\n1. Netto Gehalt berechnen."
                    + "\n2. Ein Auto erhalten."
                    + "\n3. Beenden");
            wahl = input.nextInt();
            switch (wahl) {
                case 1:
                    GehaltBerechnen();
                    weiter1 = true;
                    break;
                case 2:
                    FirmenWagen();
                    weiter1 = true;
                    break;
                case 3:
                    Beende();
                    weiter1 = false;
                    break;
                default:
                    System.out.println("Falsche Angabe");
                    weiter1 = true;
            }
        } while (weiter1);

    }

    public static void GehaltBerechnen() {
        do {
            System.out.println("Herr " + username + ", bitte wählen Sie aus,in welcher Abteilung Sie arbeiten: "
                    + "\n1. HR: 3000,00€ 		40Std/Woche"
                    + "\n2. IT: 6000,00€ 		36Std/Woche"
                    + "\n3  CM: 4000,00€ 		36Std/Woche"
                    + "\n4. BI: 5000,00€ 		40Std/Woche"
                    + "\n5. Buchhaltung: 4500€          30Std/Woche"
                    + "\n6. CC: 2000,00€		40Std/Woche"
                    + "\n7. Zurück");
            wahl = input.nextInt();
            switch (wahl) {
                case 1:

                    System.out.println("Sie arbeiten bei HR");

                    GehaltBerechnen HR = new GehaltBerechnen();
                    HR.setBrutto(3000);
                    System.out.println(HR.getBrutto());
                    HR.Gehalt();
                    weiter = false;
                    break;
                case 2:

                    System.out.println("Sie arbeiten bei IT");

                    GehaltBerechnen IT = new GehaltBerechnen();
                    IT.setBrutto(6000);
                    System.out.println(IT.getBrutto());
                    IT.Gehalt();
                    weiter = false;
                    break;
                case 3:

                    System.out.println("Sie arbeiten bei CM");

                    GehaltBerechnen CM = new GehaltBerechnen();
                    CM.setBrutto(4000);
                    System.out.println(CM.getBrutto());
                    CM.Gehalt();
                    weiter = false;
                    break;
                case 4:
                    System.out.println("Sie arbeiten bei BI");
                    GehaltBerechnen BI = new GehaltBerechnen();
                    BI.setBrutto(5000);
                    System.out.println(BI.getBrutto());
                    BI.Gehalt();
                    weiter = false;
                    break;
                case 5:
                    System.out.println("Sie arbeiten bei Buchhaltung");
                    GehaltBerechnen Buchhaltung = new GehaltBerechnen();
                    Buchhaltung.setBrutto(4500);
                    System.out.println(Buchhaltung.getBrutto());
                    Buchhaltung.Gehalt();
                    weiter = false;
                    break;
                case 6:
                    System.out.println("Sie arbeiten bei CC");

                    GehaltBerechnen CC = new GehaltBerechnen();
                    CC.setBrutto(2000);
                    System.out.println(CC.getBrutto());
                    CC.Gehalt();
                    weiter = false;
                    break;
                case 7: //zurück;
                    HauptMenu();
                    weiter = false;
                    break;
                default:
                    System.out.println("Falsche Angabe bitte nur (1-7)");
                    weiter2 = true;

            }
        } while (weiter);
    }

    public static void FirmenWagen() {
        do {
            System.out.println("Bitte wählen Sie das gewünschte Auto aus"
                    + "\n a. Audi A8"
                    + "\n b. BMW i8"
                    + "\n c. VW Golf1 (hat einfach am wenigsten Co2 Probleme)"
                    + "\n d. Mercedes A-Klasse."
                    + "\n e. Monatskarte für den Nahverkehr"
                    + "\n q. Zurück.");
            wahl = input.next().charAt(0);
            switch (wahl) {
                case 'a':
                    Audi();
                    weiter2 = false;
                    break;
                case 'b':
                    BMW();
                    weiter2 = false;
                    break;
                case 'c':
                    VW();
                    weiter2 = false;
                    break;
                case 'd':
                    Mercedes();
                    weiter2 = false;
                    break;
                case 'e':
                    System.out.println("Sie bekommen bald in Post eine neue Fahrkarte in Düsseldorf ");
                    weiter2 = false;
                    break;
                case 'q': //zurück
                    HauptMenu();
                    weiter2 = false;
                    break;
                default:
                    System.out.println("Falsche Angabe");
                    weiter2 = true;
            }
        } while (weiter2);

    }

    public static void Beende() {
        System.out.println("Sind Sie sicher?"
                + "\nj.Ja. \nn.Nein.");
        wahl = input.next().charAt(0);

        if (wahl == 'j') {
            System.out.println("Herr " + Username.username + " Programm beendet. ");
        } else if (wahl == 'n') {
            HauptMenu();
        }
    }

    public static void Farben() {
        System.out.println("Welche Farbe wünschen Sie " + username + " ? Verfügbar sind: "
                + "\n a. Schwarz."
                + "\n b. Pink."
                + "\n c. Weiß."
                + "\n d. Silber."
                + "\n q. Zurück");
    }

    public static void Audi() {
        System.out.println("Sie haben ein Audi A8 ausgewählt");
        Farben();
        do {
            wahl = input.next().charAt(0);
            switch (wahl) {
                case 'a':
                    System.out.println("Sie haben einen schwarzen Audi A8 ausgewählt");
                    weiter3 = false;
                    break;
                case 'b':
                    System.out.println("Sie haben einen pinken Audi A8 ausgewählt");
                    weiter3 = false;
                    break;
                case 'c':
                    System.out.println("Sie haben einen weißen Audi A8 ausgewählt");
                    weiter3 = false;
                    break;
                case 'd':
                    System.out.println("Sie haben einen silbernen Audi A8 ausgewählt");
                    weiter3 = false;
                    break;
                case 'q': // Zurück mit q
                    FirmenWagen();
                    weiter3 = false;
                    break;
                default:
                    System.out.println("Falsche Angabe");
                    weiter3 = true;
            }
        } while (weiter3);

    }

    public static void BMW() {
        System.out.println("Sie haben ein BMW i8 ausgewählt");
        Farben();
        do {
            wahl = input.next().charAt(0);
            switch (wahl) {
                case 'a':
                    System.out.println("Sie haben einen schwarzen BMW i8 ausgewählt");
                    weiter3 = false;
                    break;
                case 'b':
                    System.out.println("Sie haben einen pinken BMW i8 ausgewählt");
                    weiter3 = false;
                    break;
                case 'c':
                    System.out.println("Sie haben einen weißen BMW i8 ausgewählt");
                    weiter3 = false;
                    break;
                case 'd':
                    System.out.println("Sie haben einen silberen BMW i8 ausgewählt");
                    weiter3 = false;
                    break;
                case 'q': // Zurück mit q
                    FirmenWagen();
                    weiter3 = false;
                    break;
                default:
                    System.out.println("Falsche Angabe");
                    weiter3 = true;
            }
        } while (weiter3);
    }

    public static void VW() {
        System.out.println("Sie haben ein VW Golf 1 ausgewählt");
        Farben();
        do {
            wahl = input.next().charAt(0);
            switch (wahl) {
                case 'a':
                    System.out.println("Sie haben einen schwarzen VW Golf 1  ausgewählt");
                    weiter3 = false;
                    break;
                case 'b':
                    System.out.println("Sie haben einen pinken VW Golf 1 ausgewählt");
                    weiter3 = false;
                    break;
                case 'c':
                    System.out.println("Sie haben einen weißen VW Golf 1 ausgewählt");
                    weiter3 = false;
                    break;
                case 'd':
                    System.out.println("Sie haben einen silberen VW Golf 1 ausgewählt");
                    weiter3 = false;
                    break;
                case 'q': // Zurück mit q
                    FirmenWagen();
                    weiter3 = false;
                    break;
                default:
                    System.out.println("Falsche Angabe");
                    weiter3 = true;
            }
        } while (weiter3);
    }

    public static void Mercedes() {
        System.out.println("Sie haben eine Mercedes A-Klasse ausgewählt");
        Farben();
        do {
            wahl = input.next().charAt(0);
            switch (wahl) {
                case 'a':
                    System.out.println("Sie haben eine schwarze Mercedes A-Klasse ausgewählt");
                    weiter3 = false;
                    break;
                case 'b':
                    System.out.println("Sie haben eine pinke Mercedes A-Klasse ausgewählt");
                    weiter3 = false;
                    break;
                case 'c':
                    System.out.println("Sie haben eine weiße Mercedes A-Klasse ausgewählt");
                    weiter3 = false;
                    break;
                case 'd':
                    System.out.println("Sie haben eine silbere Mercedes A-Klasse ausgewählt");
                    weiter3 = false;
                    break;
                case 'q': // Zurück mit q
                    FirmenWagen();
                    weiter3 = false;
                    break;
                default:
                    System.out.println("Falsche Angabe");
                    weiter3 = true;
            }
        } while (weiter3);
    }
}
