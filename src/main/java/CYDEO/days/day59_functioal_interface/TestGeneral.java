package CYDEO.days.day59_functioal_interface;

public class TestGeneral {
    public static void main(String... eh) {
        GeneralInterface<Integer> isValidYear = year -> {
            if (year >= 0 && year <= 2022)
                System.out.println(year + " is a valid year");
            else
                System.out.println(year + " is an invalid year");
        };


        GeneralInterface<String> eachChar = str -> {
            for (char c : str.toCharArray()) {
                System.out.print("" + '\'' + c + '\'' + " ");
            }
        };


        isValidYear.test(2001);

        eachChar.test("apple");


    }
}
