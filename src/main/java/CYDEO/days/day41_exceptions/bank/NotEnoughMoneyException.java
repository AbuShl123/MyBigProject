package CYDEO.days.day41_exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException{ // extending RuntimeException makes this class unchecked exception

    public NotEnoughMoneyException() {
        super("not enough money in the account"); // allows me to define the message part of the exception
    }

}
