import java.util.Scanner;

public class MoreUserInputOfData
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int Grade, StudentID;
	    String Firstname, Lastname, Login;
		double GPA;

        System.out.println("Please enter the following information so I can sell it for a profit");
        System.out.println(" ");
        
		System.out.print("First name: ");
		Firstname = keyboard.next();
		
		System.out.print( "Last name: " );
		Lastname = keyboard.next();
		
		System.out.print( "Grade (9-12): " );
		Grade = keyboard.nextInt();
		
		System.out.print( "Student ID: " );
		StudentID = keyboard.nextInt();
		
		System.out.print( "Login: " );
		Login = keyboard.next();
		
		System.out.print( "GPA (0.0-4.0): " );
		GPA = keyboard.nextDouble();
		
		System.out.println(" ");
        
		System.out.println("Your Information: ");
		System.out.println("Login: " + Login);
		System.out.println("ID: " + StudentID);
		System.out.println("Name: " + Lastname + "," + Firstname);
		System.out.println("GPA: " + GPA);
		System.out.println("Grade " + Grade);
		
	
	}
}