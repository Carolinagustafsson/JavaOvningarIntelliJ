package Tester;

import java.util.Scanner;


public class TextSender {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Skapar en scanner inom TextSenders Scope.
        RowCounter counter = new RowCounter(); // Skapar en instans av RowCounter inom TextSenders Scope.

        String feelings = scanner.nextLine();

        while (!feelings.equals("stopp")){ // Loop påbörjas

            counter.addLine(feelings); // Skickar vår sträng Feelings som prop till counter genom funktionen addLine.
            counter.addSign(feelings);// Skickar vår sträng Feelings som prop till counter genom funktionen addSign.

            feelings = scanner.nextLine(); // Startar ny rad i consolen(Scanner).
        } //loop slutar här

        System.out.println("Antal rader: " + counter.getAntalRader()); // Skriver ut värdet AntalRader från RowCounter instansens funktion "getAntalRader"
        System.out.println("Antal tecken: " + counter.getAntalTecken()); // Skriver ut värdet AntalTecken från RowCounter instansens funktion "getAntalTecken"

    }
}

class RowCounter { // En egen klass som håller koll på antal tecken och rader
        int AntalRader = 0; //skapar  heltal för en rad
        int AntalTecken = 0; //skapar heltal för tecken

    public void addLine(String text) { // Funktion som tar emot en text sträng och adderar gamla värdet av rader med + 1.
        AntalRader = AntalRader + 1; // Adderar +1 till vårt sparade värde för "AntalRader"
    }

    public void addSign(String text) { // Funktion som tar emot en text sträng och adderar längden av "text" property med tidigare antal tecken.
        int NyaTecken = text.length(); // Sparar ner Property "text" längd i en ny int "NyaTecken"
        AntalTecken = AntalTecken + NyaTecken; // Adderar antalet tecken till vårt sparade värde "AntalTecken"

    }

    public int getAntalRader() {  // En funktion som returnerar AntalRader
        return AntalRader; // Returnerar "AntalRader"
    }

    public int getAntalTecken() { // En Funktion som returnerar AntalTecken
        return AntalTecken; // Returnerar "AntalTecken"
    }
}


