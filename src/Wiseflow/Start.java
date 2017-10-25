package Wiseflow;
public class Start {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println( "+-------------------------+ ");
        System.out.println( "|    Velkommen András!!   | ");
        System.out.println( "+-------------------------+ ");
        System.out.println("\n");


        // her viser jeg at jeg kan bruge DatHoldet i vores main.
        // Her opretter vi Datholdet som et object der hedder dat17 så vi kan hente data fra en anden klasse.
        // Og da Datholdet klassen, henter data fra studerende klassen, har jeg egentlig bevist jeg kan bruge alle 3 klasser i 1 klasse.
        DatHoldet dat17 = new DatHoldet();
        // Her lister vi vores studerende, med getStudData metoden.
        dat17.studerende1.getStudData();
        dat17.studerende2.getStudData();
        dat17.studerende3.getStudData();
        dat17.studerende4.getStudData();


        // Her initialiserer vi MineMetoder klassen.
        MineMetoder metoder = new MineMetoder();

        // Her printer vi navn Stringen i konsollen
        System.out.println(metoder.navn);
        System.out.println("");

        // Her laver vi en variabel der hedder lol, som er lig med hvad vi skriver i vores scanner.
        System.out.println("Indtast det du ønsker scanneren skal skrive i konsollen: ");
        String lol = metoder.input.next();
        System.out.println(lol);
        System.out.println(" Dette var et eksempel på at en scanner kan scanne efter input og skrive det simpelt i konsollen ");

        // Her initialisere vi spiser, som bare printer navn + spiser i konsollen.
        metoder.spiser();


        // Her initialiseres random metoden.
        System.out.println(metoder.getRandom());

        // Her initialiseres GetDag, og printer mandag fra den række Enums.
        metoder.GetDag();


    }
}
