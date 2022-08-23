package CYDEO.days.day25_array;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr1 = sc.next().toLowerCase().toCharArray();
        char[] arr2 = sc.next().toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2) ? "Anagram" : "Not anagram");
    }
}
