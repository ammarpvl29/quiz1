package first_quiz;

public class Employee {
    private String name;
    private Account account;

    public Employee(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}
