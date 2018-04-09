public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

// Er zijn 100 auto's
        cars = 100;
// Er zijn precies 4 plekken in een auto
        space_in_a_car = 4.0;
// Er zijn 30 bestuurders
        drivers = 30;
// Er zijn 90 voorbijgangers
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}
// Als hij 4 had gedaan, dan zou het bijv. ook 4.4 kunnen zijn en maakt het dus wel degelijk een verschil
// Het is een 'zwevende komma' die het getal exacter maakt
