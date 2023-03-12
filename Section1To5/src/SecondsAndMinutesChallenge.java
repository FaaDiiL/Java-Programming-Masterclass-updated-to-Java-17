package Sections1To5;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-86400));// This is the first test case
        System.out.println(getDurationString(-65,45)); // This is the second test case
        System.out.println(getDurationString(65,145)); // This is the third test case
        System.out.println(getDurationString(65,45)); // This is the third test case
        System.out.println(getDurationString(3600));// This is the first test case
    }
    public static String getDurationString (int seconds){

        // Two step approach to get hours
        String returnValue;

        if(seconds >=0){
            returnValue = getDurationString(seconds / 60, seconds % 60);
        }else {
            returnValue = "Invalid data for seconds(" + seconds
                            + "), must be a positive integer value.";
        }

        return returnValue;
    }
    public static String getDurationString (int minutes, int seconds){

        if ( minutes < 0 ) {
            return "Invalid data for minutes(" + minutes
                    + "), must be a positive integer value.";
        }

        if ( (seconds < 0) || ( seconds > 59) ) {
            return "Invalid data for seconds (" + seconds
                    + "), must be a positive integer value.";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";

    }
}
