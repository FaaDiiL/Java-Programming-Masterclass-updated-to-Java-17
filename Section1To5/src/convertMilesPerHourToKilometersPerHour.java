package Sections1To5;

public class convertMilesPerHourToKilometersPerHour {
    public static void main(String[] args) {
        // Test Cases
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long roundedValue;
        if( kilometersPerHour < 0 ) {
            roundedValue = -1;
        } else {
            roundedValue = (long) (Math.round(kilometersPerHour / 1.609));
        }
        return roundedValue;
    }
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h" );
        }
    }
}
