package CYDEO.days.day39_inheritance.a;

public class Runner {
    public static void main(String[] args) {

        // q: what did i inherit, what do I have access to?
        Condo condo = new Condo();
        condo.address = "123 L";
        condo.city = "Chicago";
        condo.state = "IL"; // is inherited because we are in the same package
        // condo.zipcode = zipcode was private so it doesn't inherit


    }
}
