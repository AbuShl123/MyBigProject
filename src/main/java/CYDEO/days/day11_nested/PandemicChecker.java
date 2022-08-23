package CYDEO.days.day11_nested;

import java.util.Scanner;

public class PandemicChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        if (r >= 1346 && r <= 1353) {

        } else if (r >= 1665 && r <= 1666) {
            System.out.println("The black death");
        } else if (r >= 1770 && r <= 1772) {
            System.out.println("Great plague of London");
        } else if (r >= 1889 && r <= 1890) {
            System.out.println("Russia plague");
        } else if (r == 1916) {
            System.out.println("American polo");
        } else if (r >= 1918 && r <= 1920) {
            System.out.println("Spanish flu");
        } else if (r >= 2009 && r <= 2010) {
            System.out.println("H1N1 Swine Flu pandemic");
        } else if (r >= 2014 && r <= 2016) {
            System.out.println("West African Ebola pandemic");
        } else if (r >= 2020 && r <= 2021) {
            System.out.println("COVID-19");
        } else {
            System.out.println("No pandemic");
        }
    }
}
