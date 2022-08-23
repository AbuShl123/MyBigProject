package CYDEO.days.day37_static.store;

public class BestBuyStores {

    public static void main(String[] args) {

        //BestBuy.location = "Fairfax"; // location is an instance variable, so we need an object in order to access
        BestBuy store1 = new BestBuy();
        store1.location = "Fairfax";
        System.out.println(store1.location);

        System.out.println(BestBuy.headquarters); // this is a static variable which means we can use a class name to access it
        System.out.println(store1.headquarters); // instances(objects) come from a class & and static members belong to class. This is valid syntax, but you should use the class name, not instance references

        // other static members
        System.out.println(Math.PI); // PI is static
        System.out.println(Integer.MIN_VALUE); // MIN_VALUE is static too


        // Arrays.sort() accessing static method from Arrays class

    }

}
