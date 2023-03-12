package Section6.TheForLoop;

public class Main {
    public static void main(String[] args) {
        /*for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        for (double rate = 2.0; rate <= 5; rate++){
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }*/

        // Challenge One
        for(double interestRate = 7.5; interestRate<=10; interestRate+=0.25){
            double interestAmount = calculateInterest(100.00, interestRate);
            System.out.println("100.00 at " + interestRate + "% interest = $" + interestAmount);
        }

        // Challenge Two
        for(double interestRate = 7.5; interestRate<=10; interestRate+=0.25){
            double interestAmount = calculateInterest(100.00, interestRate);
            if(interestRate > 8.5) break;
            System.out.println("100.00 at " + interestRate + "% interest = $" + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount *(interestRate / 100));
    }
}
