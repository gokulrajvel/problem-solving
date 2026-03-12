package Bank;

public class SavingsAccount extends BankAccount {
    public void withdraw(int amount) {
        System.out.println(amount > bankBalance ? "Cannot withdraw" : "Withdraw \ncurrent Balance" + (amount - bankBalance));
    }
}
