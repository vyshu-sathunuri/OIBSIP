import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int s = rand.nextInt(100) + 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100:");
        int g = sc.nextInt();
        
        while (g != s) {
            if (g < s) {
                System.out.println("Too low! Guess again:");
            } else {
                System.out.println("Too high! Guess again:");
            }
            g = sc.nextInt();
        }
        
        System.out.println("Congratulations! You guessed the secret number " + s + "!");
    }
}