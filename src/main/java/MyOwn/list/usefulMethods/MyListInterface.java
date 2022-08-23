package MyOwn.list.usefulMethods;
import java.util.ArrayList;

public interface MyListInterface {
    ArrayList<Integer> getRandomNumbers(int amount);
    ArrayList<Integer> getRandomNumbers(int limit, int amount);
}
