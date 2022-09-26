package myOwn.stream_;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SentParts {
    String sentence;
    public SentParts (String sentence) {
        this.sentence = sentence;
    }

    public String[] getParts() {
        return sentence.split(",");
    }


}

public class StreamPracticing {

    public static void main(String[] args) {
        int []a = {2,3,6,4,8};

        List<Integer> numbers = new ArrayList<>();
        for (int b : a) {
            numbers.add(b);
        }
        List<Integer> squared = numbers.stream().map(x -> x*x).sorted().collect(Collectors.toList());
        squared = squared.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        squared.forEach(e -> System.out.print(e + " "));

        System.out.println("\n");
        Stream<Integer> ints = numbers.stream().filter(x -> x%2==0);

        System.out.println(ints.collect(Collectors.toList()));

        SentParts obj = new SentParts("Good morning, my dear friend, how are you?");
        Optional<String> objs = Arrays.stream(obj.getParts()).findFirst();
        System.out.println(objs);
    }
}
