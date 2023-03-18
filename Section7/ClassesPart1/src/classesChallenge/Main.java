package Section7.ClassesPart1.src.classesChallenge;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.deposit(5000.0);
        bobsAccount.withdraw(100.0);
        bobsAccount.setAccountNumber(12345);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setEmail("bob.brown@email.com");
        bobsAccount.setPhoneNumber("(087) 123-4567");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getEmail());
        System.out.println(bobsAccount.getPhoneNumber());
        bobsAccount.withdraw(100.0);
        bobsAccount.withdraw(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(5000.0);

    }
}
