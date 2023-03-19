package Section7.ClassesPart1.src.classesChallenge;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account(
                12345,
                100.0,
                "Robin White",
                "Robin.White@email.com",
                "(012) 123-456"
        );
        System.out.println("========================================");

        bobsAccount.withdraw(100.0);
        bobsAccount.deposit(5000.0);
        bobsAccount.withdraw(100.0);
        System.out.println();
        bobsAccount.withdraw(100.0);
        System.out.println();
        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(500.0);
        bobsAccount.withdraw(4352.0);
        System.out.println();
        bobsAccount.withdraw(4351.0);
        System.out.println("________________________________________");

        System.out.println("Account Number: " + bobsAccount.getAccountNumber());
        System.out.println("Account Balance: " +bobsAccount.getBalance());
        System.out.println("Customer Name: " + bobsAccount.getCustomerName());
        System.out.println("Customer Email: " + bobsAccount.getEmail());
        System.out.println("Customer Phone: " + bobsAccount.getPhoneNumber());

        System.out.println("========================================");
        Account janDowsAccount = new Account();
        janDowsAccount.setAccountNumber(4585);
        janDowsAccount.setBalance(1000.0);
        janDowsAccount.setCustomerName("Jan Doe");
        janDowsAccount.setEmail("jan.doe@email.com");
        janDowsAccount.setPhoneNumber("(987) 654-321");

        System.out.println("Account Number: " + janDowsAccount.getAccountNumber());
        System.out.println("Account Balance: " +janDowsAccount.getBalance());
        System.out.println("Customer Name: " + janDowsAccount.getCustomerName());
        System.out.println("Customer Email: " + janDowsAccount.getEmail());
        System.out.println("Customer Phone: " + janDowsAccount.getPhoneNumber());
    }
}
