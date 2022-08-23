package MyOwn.list.usefulMethods;

import java.util.ArrayList;
import java.util.Random;

public class MyList implements MyListInterface{
    @Override
    public ArrayList<Integer> getRandomNumbers(int amount) {
        ArrayList<Integer> arr = new ArrayList<>();

        Random rd = new Random();

        for (int i = 0; i < amount; i++) {
            arr.add(rd.nextInt(1000));
        }

        return arr;
    }

    @Override
    public ArrayList<Integer> getRandomNumbers(int bound, int amount) {
        ArrayList<Integer> arr = new ArrayList<>();

        Random rd = new Random();

        for (int i = 0; i < amount; i++) {
            arr.add(rd.nextInt(bound));
        }

        return arr;
    }
}
