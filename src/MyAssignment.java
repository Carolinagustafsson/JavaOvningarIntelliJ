import java.util.Scanner; //importerar en scanner

public class MyAssignment {

    public static void main(String[] args) {

        //Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.

        Scanner scanner = new Scanner(System.in); //Hämtar en scanner


        String feelings = scanner.nextLine(); //Skapar en text som heter feelings

        //När användaren är klar skriver programmet ut antal tecken och hur många rader som
        // användaren har skrivit, exklusive raden med ordet stop

        int AntalRader = 0; //skapar  heltal för en rad
        int AntalTecken = 0; //skapar heltal för tecken

        while (!feelings.equals("stopp")){ //Loop påbörjas

            System.out.println(feelings); //Skriver ut det som står i while-loopen

            AntalRader = AntalRader +1;
            AntalTecken = AntalTecken + feelings.length();

            feelings = scanner.nextLine();
        } //loop slutar här


            System.out.println("Antal rader: " + AntalRader);
            System.out.println("Antal tecken: " + AntalTecken); //Detta kommer köras efter while-loopen är klar


//Använd boolean för att skicka tillbaka
        }

    }
 class TextCounter {
    private int words = 0;

    public void count(String text) {

        // Tar bort blanksteg före och efter texten
        text = text.trim();

        // Räkna bara om texten inte är tom
        if (!text.isEmpty()) {
            String[] orden = text.split("\\s+");
            words = words + orden.length;
        }
    }

    public int getWords() {
        return words;
    }
}



