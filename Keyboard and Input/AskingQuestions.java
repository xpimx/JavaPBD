import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		int height, heightf, heighti;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		heightf = keyboard.nextInt();
		
		System.out.print( "And how many inches? " );
		heighti = keyboard.nextInt();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + "years old, " + heightf + "'" + heighti + '"' + " tall and " + weight + " heavy." );
	}
}