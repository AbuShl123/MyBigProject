package CYDEO.mentoring.mentoring1308_solvingTasks;

public class SevenBoom {
    /*
    	Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears
	    in the array. Otherwise, return "there is no 7 in the array".

        Examples
        arr[1, 2, 3, 4, 5, 6, 7] ➞ "Boom!"
        // 7 contains the number seven.

        arr[8, 6, 33, 100] ➞ "there is no 7 in the array"
        // None of the items contain 7 within them.

        arr[2, 55, 60, 97, 86] ➞ "Boom!"
        // 97 contains the number seven.
     */

    public String sevenBoom(int[] arr) {
        // arr[] = {1,34,7,10}
        String numbersOfArray = "";
        for (int v : arr) {
            numbersOfArray += v;
        }
        // numbersOfArray = "134710"
        if (numbersOfArray.contains("7")) {
            return "Boom!";
        } else {
            return "There is no 7 in the array";
        }
    }

    /*
    int a = 12;
    print(a) --> 12


    int[] arr = {12, 7, 4, 9, 10};
    //            0  1  2  3   4

    print (Arrays.toString(arr)) --> [12, 7, 4, 9, 10]

    print (arr[0]) --> 12
     */
}
