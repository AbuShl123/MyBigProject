package CYDEO.days.day42_abstraction.exception_recap;

public class InvalidSelectionException extends Exception { // being a subclass of an exception class makes this a checked exception.

    public InvalidSelectionException() {
        super("Selection can only be 1, 2 or 3");
    }

    public InvalidSelectionException(String message) {
        super(message);
    }

}
