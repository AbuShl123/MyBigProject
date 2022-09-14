package CYDEO.days.day44_polimorphysm.clothes;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Wearing up the jacket");
    }

    @Override
    public int num() {
        return 12;
    }

    @Override
    public void wearHood() {
        System.out.println("wearing up the hood");
    }
}
