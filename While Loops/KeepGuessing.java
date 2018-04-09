import java.util.Scanner;
import java.util.Random;


public class KeepGuessing {

      public static void main(String[] args) {
            
            Random r = new Random();

            int secretNumber = 1 + r.nextInt(10);
            
            Scanner keyboard = new Scanner(System.in);

            int guess;
            
            System.out.println("I'm thinking of a number from 1 to 10");

            System.out.print("Your guess: ");

            guess = keyboard.nextInt();

            if (guess == secretNumber)

                  System.out.println("Your guess is correct. Congratulations!");
            
            while ( guess != secretNumber)
            {
                System.out.println("incorrect, try again." );
                System.out.print("take a guess: ");
                guess = keyboard.nextInt();
            }
          if (guess == secretNumber)

                  System.out.println("Your guess is correct. Congratulations!");
            
      }

}

