package first_quiz;

public class Account {
    private String bankName;
    private int accountNumber;

    public Account(String bankName, int accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
