import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void guessGame(ReadWerte readWerte){
        if (readWerte.getFirstNumber() <= 50 && readWerte.getSecondNumber() <= 50){
            System.out.println("The numbers are ok");
        } else {
            throw new IllegalStateException("Please enter Number 50 or less then 50");
        }

        Random rand = new Random();
        int m = rand.nextInt(50)+1;
        System.out.println("The first number is: " + readWerte.getFirstNumber());
        System.out.println("The second number is: " + readWerte.getSecondNumber());
        System.out.println("Number from java is : " + m);

        if ( readWerte.getFirstNumber() > m )
            System.out.println("Player 1 won");
        else
            System.out.println("Player 1 lost");

        if (readWerte.getSecondNumber() > m )
            System.out.println("Player 2 won");
        else
            System.out.println("Player 2 lost");

        if (readWerte.getSecondNumber() < m && readWerte.getFirstNumber() < m)
            System.out.println("Java won");
        else
            System.out.println("Java lost");

    }
}