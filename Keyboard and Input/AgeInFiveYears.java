import java.util.Scanner;

public class AgeInFiveYears
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int Age;
		String Name;
		
		System.out.print( "Hello. What is your name?" );
		Name = keyboard.next();
		
		System.out.println(" ");
		
		System.out.println("Hi " + Name + "! How old are you?" );
		Age = keyboard.nextInt();
		
		System.out.println(" ");
		
		System.out.println("Did you know that in five years you will be " + (Age+5) + " years old?");
		System.out.println("And five years ago you were " + (Age-5) + "! Imagine that!");
		
	}
	
}
		
		
		