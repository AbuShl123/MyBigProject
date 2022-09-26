import CYDEO.days.day40_inheritance.shape.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Time {
    public static String countLetters(String str){
        String res = "";
        while (str.length() !=  0) {
            String let = str.substring(0,1);
            int c = str.length();
            str = str.replace(let, "");
            c -= str.length();
            res += let + c;
        }
        return res;
    }

    public static int getDup(String[] arr) {
        int con = 0;
        String mem = "";
        for (String v : arr) {
            if (mem.contains(v)) continue;
            mem += v + ", ";
            int cc = 0;
            for (String e : arr) {
                if (v.equals(e)) cc++;
            }
            if (cc!=1) con += cc;
        }
        return con;
    }

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        String s = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, s);
        return list;
    }


    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums) {
        nums = (ArrayList<Integer>) nums.stream().map(x -> x*2).collect(Collectors.toList());
        return nums;
    }

    public static void run(int min) {
        System.out.println("running for " + min + " minutes");
    }



    public static void main(String[] args) {

        int[] arr = {1,2,3};
        arr = Arrays.copyOf(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}





