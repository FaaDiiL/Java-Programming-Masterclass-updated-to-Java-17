package Section7.ClassesPart1.src.classesChallenge;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.setAccountNumber(12345);
        bobsAccount.setBalance(100.0);
        bobsAccount.setCustomerName("Robin White");
        bobsAccount.setEmail("Robin.White@email.com");
        bobsAccount.setPhoneNumber("(012) 123-456");


        bobsAccount.withdraw(100.0);
        bobsAccount.deposit(5000.0);
        bobsAccount.withdraw(100.0);

        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(500.0);
        bobsAccount.withdraw(4352.0);

        bobsAccount.withdraw(4351.0);

        System.out.println("Account Number: " + bobsAccount.getAccountNumber());
        System.out.println("Account Balance: " +bobsAccount.getBalance());
        System.out.println("Customer Name: " + bobsAccount.getCustomerName());
        System.out.println("Customer Email: " + bobsAccount.getEmail());
        System.out.println("Customer Phone: " + bobsAccount.getPhoneNumber());
    }
}
