package Sections1To5;

public class EqualityPrinterChallenge {
    public static void main(String[] args) {
        printEqual(1, 1, 1);    // should print text All numbers are equal
        //printEqual(1, 1, 2);    // should print text Neither all are equal or different
        //printEqual(-1, -1, -1); // should print text Invalid Value
        //printEqual(1, 2, 3);    // should print text All numbers are different
    }
    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber) {
        if((firstNumber < 0) || (secondNumber < 0) || (thirdNumber < 0) ){
            System.out.println("Invalid Value");
            return;
        }
        if((firstNumber ==  secondNumber) &&
            (secondNumber == thirdNumber) &&
            (firstNumber == thirdNumber)) {
            System.out.println("All numbers are equal");
            return;
        }

        if((firstNumber ==  secondNumber) ||
            (secondNumber == thirdNumber) ||
            (firstNumber == thirdNumber)) {
            System.out.println("Neither all are equal or different");
            return;
        }


        if((firstNumber !=  secondNumber) &&
            (secondNumber != thirdNumber) &&
            (firstNumber != thirdNumber)){
            System.out.println("All numbers are different");
            return;
        }
    }
}
