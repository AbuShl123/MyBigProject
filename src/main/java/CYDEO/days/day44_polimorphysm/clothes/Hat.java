package CYDEO.days.day44_polimorphysm.clothes;

public class Hat extends Clothes{
    @Override
    public void wear() {
        System.out.println("wearing up the hat");
    }

    @Override
    public int num() {
        return 12;
    }
}
