public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for ( char c='A'; c <= 'E'; c++ )
        {
            for ( int n=1; n <= 3; n++ )
            {
                System.out.println( n + " " + c );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            System.out.println();
        }

        System.out.println("\n");

    }
}
// The inner loop (n)
// It displays the number first now instead of the letter
// It becomes vertical instead of horizontal
// It splits into 3 seperate lines 