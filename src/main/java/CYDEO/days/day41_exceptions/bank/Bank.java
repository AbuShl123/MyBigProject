package CYDEO.days.day41_exceptions.bank;

public class Bank {
    double balance;

    public void withDraw(double amount) {
        if (balance - amount < 0) {
            throw new NotEnoughMoneyException();
        }
        balance -= amount;
        System.out.println("Money withdraw");
        System.out.println(balance);

    }
}
