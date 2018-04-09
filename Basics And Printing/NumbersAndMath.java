// De class maken
public class NumbersAndMath
{
    //Public Static en void zorgen ervoor dat dit bestand ook aanroepbaar is vanuit andere bestanden voor Java
	public static void main( String[] args )
	{
	    //Gewoon een lijn tekst erin zetten door middel van "System.out.println"
		System.out.println( "I will now count my chickens:" );
        // Hier idem dito alleen nu maken we een combinatie van letters en getallen, Eerst zetten we het woord tussen
        // aanhalingstekens en dan + en tussen haakjes de som die je uit wilt rekenen erin zetten. Hieruit komt "Hens 30"
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		// 
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );

		System.out.println( "Now I will count the eggs:" );
        // De procent rekent het percentage van iets van een deelsom uit bijv. 5/2 Is 2 en de Procent is dan 1 omdat deze
        // deelsom nog 1 overhoudt
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );

		System.out.println( "Is it true that 3.0 + 2.0 < 5.0 - 7.0?" );
        // Uit onderstaande line zal 'False' komen omdat 3 + 2 Niet kleiner is dan 5 - 7
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );

		System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );

		System.out.println( "Oh, that's why it's false." );

		System.out.println( "How about some more." );

		System.out.println( "Is it greater? " + ( 5.0 > -2.0 ) );
		System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ) );
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
	}
}