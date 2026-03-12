package Bank;

public class BankAccount {
    protected int bankBalance = 100;

    public void deposit(int amount) {
        bankBalance += amount;
    }

    public void withdraw(int amount) {
        System.out.println(amount > bankBalance ? "Cannot withdraw" : "Withdraw");
    }
}
