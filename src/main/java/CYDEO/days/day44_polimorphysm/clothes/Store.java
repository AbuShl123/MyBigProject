package CYDEO.days.day44_polimorphysm.clothes;

import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        Clothes clothes1 = new Hat();
        HasHood clothes2 = new Jacket();
        Clothes clothes3 = new Jacket();
        Clothes clothes4 = new TShirt();

        Clothes[] clothes = new Clothes[7];
        clothes[0] =  clothes1;
        clothes[1] = clothes3;
        clothes[2] = clothes4;
        clothes[3] = new TShirt();
        clothes[4] = new Hat();
        clothes[5] = new Jacket();
        clothes[6] = clothes3;


        ArrayList<Clothes> list = new ArrayList<>();
        list.add(clothes1);
        list.add(new Jacket());
        list.add(clothes4);

        for (Clothes v : clothes) {
            v.wear();
        }

        System.out.println("===================");
        buy(clothes1);
        buy(clothes3);

        buy((Clothes) clothes2);
        clothes2.wearHood();

        int a = clothes1.num();
        int b = ((Clothes) clothes2).num(); // wooow!!! incredible!!!


        Clothes clothes5 = (Clothes) clothes2;
        buy(clothes5);
    }

    public static void buy(Clothes clothes) {
        if (clothes instanceof Jacket) {
            System.out.println("Jacket costs 29.99");
        } else if (clothes instanceof Hat) {
            System.out.println("Hat costs 19.99");
        } else if (clothes instanceof TShirt) {
            System.out.println("t-shirt costs 9.99");
        } else {
            throw new RuntimeException(clothes.getClass() + "not instance of " + clothes.getClass());
        }
    }
}
