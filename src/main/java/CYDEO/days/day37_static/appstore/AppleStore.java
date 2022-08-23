package CYDEO.days.day37_static.appstore;

public class AppleStore {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("Iphone X", "Black", 1000, 256);

        System.out.println(iphone1);
        System.out.println(Iphone.brand);
        System.out.println(Iphone.os);

        Iphone iphone2 = new Iphone("Iphone 7", "Silver", 1000, 256);
        System.out.println(iphone2);
    }
}
