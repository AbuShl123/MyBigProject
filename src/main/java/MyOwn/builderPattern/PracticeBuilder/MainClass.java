package MyOwn.builderPattern.PracticeBuilder;

public class MainClass {
    public static void main(String[] args) {
        House house1 = new HouseBuilder(1000, "modern", 3).hasPool("Yes");


        String str = "Hello";

        System.out.println(str.replace("llo", "vy"));





    }
}
