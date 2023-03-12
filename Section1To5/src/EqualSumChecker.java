package Sections1To5;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }
    public static boolean hasEqualSum(int operand1, int operand2, int equalSumChecker) {
        return operand1 + operand2 == equalSumChecker;
    }
}
