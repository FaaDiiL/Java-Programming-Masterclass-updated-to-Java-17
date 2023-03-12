package Section6.ThePrimeNumberChallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");

        System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");
    }
    public static boolean isPrime(int wholeNumber) {
        if ( wholeNumber <= 2 ) {
            return (wholeNumber == 2);
        }
        for (int devisor = 2; devisor < wholeNumber; devisor++) {
            if (wholeNumber % devisor == 0) {
                return false;
            }
        }
        return true;
    }
}
create a docker dev envirement with:
postgress database:
     username: fadil
     password: password
     database: myDb
nodejs
React app with next-js,typescript, tailwind css, storybook

