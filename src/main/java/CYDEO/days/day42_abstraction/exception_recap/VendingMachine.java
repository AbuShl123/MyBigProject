package CYDEO.days.day42_abstraction.exception_recap;

import lombok.SneakyThrows;

public class VendingMachine
{

    public static String select(int selection)
    {
        String item = "";
        switch (selection)
        {
            case 1: item = "Chips"; break;
            case 2: throw new OutOfStockException();
            case 3: item = "Candy"; break;
        }
        return item;
    }


    public static String selectValid(int selection) throws InvalidSelectionException
    {
        String item = "";
        switch (selection)
        {
            case 1: item = "Chips"; break;
            case 2: item = "Gum"; break;
            case 3: item = "Candy"; break;
            default:
                throw new InvalidSelectionException(); // checked exception - must be handled - but also I created this, so I don't want to handle myself.
        }
        return item;
    }

    public static void main(String[] args)  // throws InvalidSelectionException
    {
        System.out.println(select(1)); // this method has an unchecked exception - normally these exceptions are not handled

        try
        {
            System.out.println(selectValid(5));
        }
        catch (InvalidSelectionException ignored)
        {

        }
    }

    // using throws in main will allow compiling, but you didn't handle the exception so when we give invalid data exception happens and program stops.
}
