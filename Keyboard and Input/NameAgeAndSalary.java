import java.util.Scanner;

public class NameAgeAndSalary
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
	    String name;
		double earnings;

		System.out.print( "Hello. What is your name" );
		name = keyboard.next();

		System.out.print( "Hi " + name + " How old are you?" );
		age = keyboard.nextInt();
		
		System.out.print( "So you're " + age + " eh? Thats not old at all! How much do you make " + name + "?" );
		earnings = keyboard.nextDouble();

		System.out.println( earnings + "! I hope thats per hour and not per year! LOL!" );
	}
}