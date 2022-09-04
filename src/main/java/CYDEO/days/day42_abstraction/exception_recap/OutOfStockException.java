package CYDEO.days.day42_abstraction.exception_recap;

public class OutOfStockException extends RuntimeException{ // being the child of runTime exception means we create an unchecked exception

    public OutOfStockException() {
        super("Item is out of stock"); // this helps us to define the message of the exception
    }

    public OutOfStockException(String message) {
        super(message);
    }

}
