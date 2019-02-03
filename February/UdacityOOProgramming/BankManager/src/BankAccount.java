import java.util.Date;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main (String[] args) {

        //Creating a CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount(2000);
        System.out.println(checkingAccount.getAccountNumber() + " | " + checkingAccount.getBalance());
        System.out.println(checkingAccount.getLimit() + "\n");

        //Creating a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(6);
        System.out.println(savingsAccount.getAccountNumber() + " | " + savingsAccount.getBalance());
        System.out.println(savingsAccount.getTransfers() + "\n");

        //Creating a COD
        CertificateOfDeposit cod = new CertificateOfDeposit(new Date());
        System.out.println(cod.getAccountNumber() + " | " + cod.getBalance());
        System.out.println(cod.getExpiry() + "\n");

    }
}
