package CYDEO.days.day14_String;

public class EqualsMethod {
    public static void main(String[] args) {
        String str = "pen";

        String str2 = "Pen";


        String str3 = new String ("pen");
        System.out.println(str.equals(str2));
        System.out.println(str.equals("pen"));
        System.out.println(str.equals("Pen"));
        System.out.println(str.equals(str3));


        System.out.println(str.equalsIgnoreCase("str2"));
    }
}
