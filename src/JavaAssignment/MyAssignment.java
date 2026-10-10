package JavaAssignment;

import java.util.Scanner; //importerar en scanner

public class MyAssignment {

    public static void main(String[] args) {


        //Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.

        Scanner scanner = new Scanner(System.in); //Hämtar en scanner

        String feelings = scanner.nextLine(); //Skapar en text som heter feelings

        TextCounter counter = new TextCounter();

        //När användaren är klar skriver programmet ut antal tecken och hur många rader som
        // användaren har skrivit, exklusive raden med ordet stop

        while (!isStop(feelings)){ //Loop påbörjas

            System.out.println(feelings); //Skriver ut det som står i while-loopen

            counter.countRows(feelings);
            counter.countLetters(feelings);

            feelings = scanner.nextLine();
        } //loop slutar här


        System.out.println("Antal Rader: " + counter.getRows());
        System.out.println("Antal tecken: " + counter.getLetters());



        }
    public static boolean isStop(String text) {
        return text.equals("stopp");
    }

}




