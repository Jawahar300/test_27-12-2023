import java.util.Random;
import java.util.Scanner;

public class GuesstheNumberGame {
    public static void main(String[] args) {
        System.out.println("Welcome to guess the number game..");
        Scanner scanner = new Scanner(System.in);


        Random random = new Random();
        int randomNumber = random.nextInt(100);


        for (int i = 0; i <= 5; i++) {
            int getNumber = scanner.nextInt();
            switch (i) {
                case 0:
                    System.out.println("Enter the 1st guess");
                    break;
                case 1:
                    System.out.println("Enter the 2nd guess");
                    break;
                case 2:
                    System.out.println("Enter the 3rd guess");
                    break;
                case 4:
                    System.out.println("Enter the 4th guess");
                    break;
                case 5:
                    System.out.println("Enter the 5th guess");
            }


            if (getNumber == randomNumber) {
                System.out.println("the guess is correct...");
                break;
            } else System.out.println("the guess is wrong... better luck next time.");

        }
    }
}

