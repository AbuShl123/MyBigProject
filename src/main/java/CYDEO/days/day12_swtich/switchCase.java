package CYDEO.days.day12_swtich;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        int day = 4;
        Scanner sc = new Scanner(System.in);
        switch (day) {
            default:
                System.out.println("Not a valid!"); break;
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.print("Thursday");
                day += sc.nextInt();
                switch (day) {
                    case 5:
                        System.out.println("----Wait, this is a secret day!"); break;
                    case 7:
                        System.out.println("Normal day"); break;
                    case 6:
                        System.out.println("Unusual day"); break;
                }
                break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            case 7:
                System.out.println("Sunday"); break;

        }
    }
}
