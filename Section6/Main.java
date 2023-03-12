// Section 6
// Episode 56
package Section6;
public class Main {
    public static void main(String[] args) {
        /*
        int value = 4;

        if(value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        }else {
            System.out.println("Was not 1 or 2");
        }
        */
        /**
         * Valid Switch Value types
         *  : byte, short, int, char
         *  : Byte, Short, Integer, Character
         *  : String
         *  : enum
         */
        /*
            // Traditional Switch Statement
            int switchValue = 3;
            switch (switchValue) {
                case 1:
                    System.out.println("Value was 1");
                    break;
                case 2:
                    System.out.println("Value was 2");
                    break;
                    // Grouping case tests together in one line effectively,
                    //  to group values that will have the same behavior.
                case 3: case 4: case 5:
                    System.out.println("Was a 3, a 4, a 5");
                    System.out.println("Actually it was a " + switchValue);
                    break;
                default:
                    System.out.println("Was not 1, 2, 3, 4 or 5");
                    break;
            }
        */
        // Enhanced Switch Statement
        int enhancedSwitchValue = 3;
        switch (enhancedSwitchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");

            // Grouping case tests together in one line effectively,
            //  to group values that will have the same behavior.
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, a 5");
                System.out.println("Actually it was a " + enhancedSwitchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }
        String month = "xyz";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter.");
    }
    public static String getQuarter(String month) {
        /*
           switch (month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
            }
            return "bad";
        */

        // Enhanced Switch
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st";}
            case "APRIL", "MAY", "JUNE" -> { yield "2nd"; }
            case "JULY", "AUGUST", "SEPTEMBER" -> { yield "3rd"; }
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> { yield "4th"; }
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
