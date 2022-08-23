package CYDEO.Days.day21_loops;

public class BiggestSubstring {
    public static void main(String[] args) {
        String str = "gggghhhtttrrreeewwwwwwwwwwwwwwwwwwwwwwwwwww";
        String longest = "";
        String each = "";
        for (int i = 1; i < str.length(); i++) {
            each += str.charAt(i);
            if (i == str.length()-1 || str.charAt(i) != str.charAt(i+1)) {
                if (longest.length() < each.length()) {
                    longest = each;
                }
                each = "";
            }
        }
        System.out.println(longest);
    }
}
