public class CheckingAccount extends BankAccount{

    private double limit;

    public CheckingAccount(double limit) {
        super.setAccountNumber(String.valueOf((Math.random() * 10000) + 1));
        super.setBalance(0);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }
}
