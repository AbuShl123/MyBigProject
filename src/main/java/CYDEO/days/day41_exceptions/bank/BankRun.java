package CYDEO.days.day41_exceptions.bank;

public class BankRun {
    public static void main(String[] args) {
        Bank obj = new Bank();
        obj.balance = 3000;

        obj.withDraw(2000);

        try {
            obj.withDraw(2000);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
