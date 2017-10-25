package Wiseflow;

import java.util.Scanner;

public class MineMetoder {

    // Her laver vi et variabel som hedder navn, den er af datatypen String. Og kan indeholde tal og bogstaver.
    String navn = "Mathias";

    // Her laver vi en scanner, som scanner efter input af brugeren.
    // Vi kan selv bestemme hvilken datatype inputten af brugeren skal være.
    Scanner input = new Scanner(System.in);

    // Her laver vi en metode der hedder spiser, void betyder at den ingen værdi returnerer.
    void spiser(){
        System.out.println( navn + " Spiser ");
    }

    // Random metoden
    // Laver et random tal, Da jeg har valgt double som datatypen, kan den lave random kommatal.
    // Hvis jeg havde skrevet int getRandom havde den f.eks kun lavet random heltal.
    double getRandom(){
        return Math.random();
    }

    //Enums
    // Enums er konstanter, og kan benyttes når du skal lave en række konstanter.
    enum Dag{
        Mandag, Tirsdag, Onsdag, Torsdag, Fredag, Lørdag, Søndag
    }
    // For at kunne printe vores enums skal vi lave en metode som henter data fra dem.
    // Neden under ses en simpel getter som henter Mandag.
    void GetDag(){
        System.out.println(Dag.Mandag);
    }

    
    


}
