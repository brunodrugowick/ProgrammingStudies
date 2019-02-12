import java.util.Date;

public class CertificateOfDeposit extends BankAccount {

    private Date expiry;

    public CertificateOfDeposit(Date expiry) {
        super.setAccountNumber(String.valueOf((Math.random() * 10000) + 1));
        super.setBalance(0);
        this.expiry = expiry;
    }

    public Date getExpiry() {
        return expiry;
    }
}
