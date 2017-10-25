package Wiseflow;
public class Studerende {

    // Her laver vi et variabel alder, som default er ingenting.
    private int alder;
    // Her laver vi et variabel navn, som default er ingenting.
    private String navn;
    // Her laver vi et variabel højde, som default er ingenting.
    private double højde;
    // Her laver vi et variabel, om studerende bruger mac eller ej.
    private boolean MacBruger;

    /* Her laver vi en constructor som gør at vi kan oprette nye studerende nemt.
    Dog kræver den at vi har navn, alder, om personen bruger mac og brugerens højde
   **/

    public Studerende(String navn, int alder, boolean macBruger, double højde) {
        this.navn = navn;
        this.alder = alder;
        this.MacBruger = macBruger;
        this.højde = højde;
    }

    // En ny constructor som gør det muligt at oprette nye studerende hvis man kun har deres alder, navn og om de bruger mac.
    public Studerende(String navn, int alder, boolean macBruger) {
        this.navn = navn;
        this.alder = alder;
        this.MacBruger = macBruger;
    }




    // Her laver vi teknisk set encapsulation, vi laver nogle funktioner som er public, som henter private data.
    // Så brugeren teknisk set kun får adgang til disse variabler.

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public double getHøjde() {
        return højde;
    }

    public boolean isMacBruger() {
        return MacBruger;
    }

    public void getStudData(){

        // Her er en if sætning, den består af en boolean og en funktion. Når boolean forholdet mødes, initialiseres funktionen.
        if (højde == 0) System.out.println(" -Højde ikke angivet for denne studerende- ");
        System.out.println(" Navn: " + navn);
        System.out.println(" Alder:  " + alder + " År ");
        System.out.println(" Højde: " + højde + " Meter ");
        System.out.println(" Er dette en macbruger: " + MacBruger);
        System.out.println(" \n");

    }
}

