public class SavingsAccount extends BankAccount {

    private int transfers;

    public SavingsAccount(int transfers) {
        super.setAccountNumber(String.valueOf((Math.random() * 10000) + 1));
        super.setBalance(0);
        this.transfers = transfers;
    }

    public int getTransfers() {
        return transfers;
    }
}
