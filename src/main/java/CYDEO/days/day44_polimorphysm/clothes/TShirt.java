package CYDEO.days.day44_polimorphysm.clothes;

public class TShirt extends Clothes{
    @Override
    public void wear() {
        System.out.println("wearing up the t-shirt");
    }

    @Override
    public int num() {
        return 12;
    }
}
