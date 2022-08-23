package MyOwn.recursion;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) { // 5! = 5*4*3*2*1
        if (n == 1)
            return 1;
        else
        return(n * factorial(n-1));
        /*

        return 5 * static int factorial (int n = 4) {
                        if (n==1)
                            return 1;
                        else
                        return 4 * static int factorial (int n = 3) {
                                        if (n==1)
                                            return 1;
                                        else
                                            return 3 * static int factorial (int n = 2) {
                                                            if (n == 1)
                                                                return 1
                                                            else
                                                                return 2 * static int factorial (int n == 1) {
                                                                                if (n == 1)
                                                                                return 1;
                                                                           }
                                                       }
                                    }
                    }
         */
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}
