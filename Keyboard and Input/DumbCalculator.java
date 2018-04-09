import java.util.Scanner;

public class DumbCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		double Numberr, Numberrr, Numberrrr;
		
		System.out.print( "What is your first number?" );
		Numberr = keyboard.nextDouble();
		
		System.out.print( "What is your second number?" );
		Numberrr = keyboard.nextDouble();
		
		System.out.print( "What is your third number" );
		Numberrrr = keyboard.nextDouble();
		
		System.out.println("( " + Numberr + " + " + Numberrr + " + " + Numberrrr + " ) / 2 is..." + ((Numberr + Numberrr + Numberrrr) / 2));
		
	}
}