package Wiseflow;
public class DatHoldet {




    // Her opretter vi en ny studerende, nemlig mig selv. Jeg benytter den simple constructor her som kun kræver 3 inputs.
        // Navn, alder og om jeg er macbruger eller ej.
        Studerende studerende1 = new Studerende(" Mathias", 21, true);
        // Her opretter vi en ny studerende, Johan, her bruger vi den anden constructor som kræver 4 inputs.
        // Navn, alder, macbruger og højde.
        Studerende studerende2 = new Studerende(" Johan", 21, false, 1.83);
        // Her bruger vi constructoren om de spiser og læser.
        Studerende studerende3 = new Studerende(" Mikkel", 21, false);
        Studerende studerende4 = new Studerende(" Benjamin", 26, false, 1.80);




}
