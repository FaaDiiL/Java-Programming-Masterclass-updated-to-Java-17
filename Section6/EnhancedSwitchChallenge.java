package Section6;

public class EnhancedSwitchChallenge {
    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(isLeapYear(2400));
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid Day";
        };
        System.out.println( day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day) {
        String dayOfWeek = "Invalid Day";
        if(day == 0){
            dayOfWeek = "Monday";
        } else if(day == 1){
            dayOfWeek = "Tuesday";
        } else if(day == 2){
            dayOfWeek = "Wednesday";
        } else if(day == 3){
            dayOfWeek = "Thursday";
        } else if(day == 4){
            dayOfWeek = "Friday";
        } else if(day == 5){
            dayOfWeek = "Saturday";
        } else if(day == 6){
            dayOfWeek = "Sunday";
        }
        System.out.println("Day "+ day + " is " + dayOfWeek);
    }
    public static void printNumberInWord(int number) {
        switch(number){
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }

    public static boolean isLeapYear (int year) {
        if(year < 1 || year > 9999) return false;

        boolean isLeap = false;
        if(year % 4 == 0 && !(year % 100 == 0 ) || year % 400 == 0){
            isLeap =  true;
        }

        return isLeap;
    }
    public static int getDaysInMonth (int month, int year) {
            if(year <1 || year > 9999) return -1;
            if(month < 1 || month > 12) return -1;

            int daysInMonth = switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 ->  31;
                case 2 -> isLeapYear(year) ? 29 : 28;
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };
            return daysInMonth;
    }
}
