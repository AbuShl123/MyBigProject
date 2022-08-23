package CYDEO.days.day04_Recap;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "IPhone X";
        String color = "Black"; // lives matter

        double price = 100.99;
        boolean hasCamera = true;

        int size = 128;
        char sim = 'A';

        System.out.println("Phone information: \nBrand: " + brand);
        System.out.println(model + " in " + color);
        System.out.println("Has is camera? -- " + hasCamera);
        System.out.println("With " + size + "Gb the sim card is " + sim + " type");
        System.out.println("The price is $" + price);
    }
}
