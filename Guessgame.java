import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int secretNumber = rand.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 0;
        
        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("I have chosen a number between 1 to 100");
        System.out.println("Can you guess it?");
        
        do {
            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();
            attempts++;
            
            if(guess < secretNumber) {
                System.out.println("Too Low! Try higher number");
            } else if(guess > secretNumber) {
                System.out.println("Too High! Try lower number");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
            }
        } while(guess != secretNumber);
        
        sc.close();
    }
}
