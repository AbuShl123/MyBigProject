package MyOwn.finalKeyword;

public class Example1 {
    public int value = 5;
}

class frVariable {
    public static void FinalReference( String []args) {

        final Example1 example = new Example1(); //declaration
        example.value = 6; // Modifying the object creates no disturbance

        Example1 another = new Example1();
     // example = another; // Attempting to change the object it refers to, creates an error

    }
}