package CYDEO.days.day39_inheritance.a;

public class House {

    public String address;
    protected String city;
    // protected :
    /*
    without inheritance -- acts like default, accessible in the same package

    with inheritance -- protected fields and methods can be inherited to subclasses anywhere
     */
    String state;
    private String zipcode;

    public String getZipCode() {
        return zipcode;
    }

}
