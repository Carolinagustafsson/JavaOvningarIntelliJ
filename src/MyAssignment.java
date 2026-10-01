import java.util.Scanner;

public class MyAssignment {

    public static void main(String[] args) {

        //Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.

        Scanner scanner = new Scanner(System.in);

        String feelings = scanner.nextLine();

        while (!feelings.equals("stopp")){
            System.out.println(feelings);

            feelings = scanner.nextLine();

        }

    }
}
