package CYDEO.Days.day19_loops;

public class CountLetter {
    public static void main(String[] args) {
        String word = "waterfall";
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
