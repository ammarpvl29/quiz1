package first_quiz;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Liberty Bank", 122002244);
        Employee employee = new Employee("Amru", account);

        System.out.println("Employee name : " + employee.getName());
        System.out.println("Bank Name : " + employee.getAccount().getBankName());
        System.out.println("Account Number : " + employee.getAccount().getAccountNumber());
    }
}