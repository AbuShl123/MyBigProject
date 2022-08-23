package CYDEO.Days.day21_loops;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "ananas";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.length() - str.replace(str.substring(i,i+1), "").length() == 1 ? str.charAt(i) : "");
        }

    }
}
