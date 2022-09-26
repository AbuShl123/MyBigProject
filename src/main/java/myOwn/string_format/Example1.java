package myOwn.string_format;

public class Example1 {
    public static void main(String[] args) {
        String company = "Google";

        // concatenation of two strings
        String s = String.format("My Company name is %s", company);
        System.out.println(s);

        // the output 8 decimal places
        String s2 = String.format("My answer is %.8f", 47.65734);
        System.out.println(s2);

        // Here answer is supposed to be %15.8f" and
        // "47.65734000" there are 15 spaces
        String s3 = String.format("My answer is %15.8f",     47.65734);
        System.out.println(s3);
    }
}
