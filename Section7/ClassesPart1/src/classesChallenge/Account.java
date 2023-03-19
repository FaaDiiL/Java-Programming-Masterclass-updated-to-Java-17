package Section7.ClassesPart1.src.classesChallenge;

public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        setBalance(this.balance += depositAmount);
        System.out.println("Deposit of " + depositAmount + " made. New balance is $" + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Only $" + this.balance + " available. Withdrawal not processed");
        } else {
            setBalance(this.balance -= withdrawAmount);
            System.out.println("Withdrawal of $" + withdrawAmount + " processed. Remaining balance = $" + this.balance);
        }
    }

}
