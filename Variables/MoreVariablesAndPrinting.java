public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {

        String Name = "Zed A. Shaw";
        int Age = 35;     // not a lie
        int Height = 74;  // inches
        int Weight = 180; // lbs
        String Eyes = "Blue";
        String Teeth = "White";
        String Hair = "Brown";
        double HeightinCentimetres = Height * 2.54;
        double WeightinKilos = Weight * 0.45359237;
        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + Height + " inches " + "(or " + HeightinCentimetres + " cm)" + " tall." );
        System.out.println( "He's " + Weight + " pounds " + "(or " + WeightinKilos + " Kg)" + " heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
            + " I get " + (Age + Height + Weight) + "." );
    }
}
