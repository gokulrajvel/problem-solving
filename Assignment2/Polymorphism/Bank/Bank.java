package Bank;

public class Bank {
    public static void main(String[] args) {
        BankAccount obj = new SavingsAccount();
        obj.deposit(500);
        obj.withdraw(500);
    }
}