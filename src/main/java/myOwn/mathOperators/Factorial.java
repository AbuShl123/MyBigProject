package myOwn.mathOperators;

public class Factorial {
    static int a = 1;
    public int factorial(int n ) { // 5! = 5*4*3*2*1
        if (n == 1)
            return 1;
        else
            return(n * factorial(n-1));
    }
}
