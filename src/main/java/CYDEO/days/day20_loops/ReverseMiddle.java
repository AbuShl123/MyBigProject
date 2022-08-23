package CYDEO.Days.day20_loops;

public class ReverseMiddle {
    public static void main(String[] args) {
        String str = "I love java";
        int start = str.indexOf(' ') + 1;
        int end = str.lastIndexOf(' ');

        String middleWord = str.substring(start, end);
        String reversedMiddle = "";
        for (int i = middleWord.length()-1; i > -1; i--) {
            reversedMiddle += middleWord.charAt(i);
        }
        System.out.println(str.replace(middleWord, reversedMiddle));
    }
}
