import java.util.Scanner;

public class ForgetfulMachine
{
    public static void main( String [] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        String word1, word2;
        int number1, number2;
        
        System.out.print( "Give me a word!" );
		word1 = keyboard.next();

		System.out.print( "Give me a second word!" );
		word2 = keyboard.next();
		
		System.out.print( "Great, now your favorite number? " );
		number1 = keyboard.nextInt();

		System.out.print( "And your second-favorite number... " );
		number2 = keyboard.nextInt();
		
		System.out.println( "Whew! Wasn't that fun?");

    }
}