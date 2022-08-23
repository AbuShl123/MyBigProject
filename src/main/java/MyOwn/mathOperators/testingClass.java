package MyOwn.mathOperators;

import java.util.Scanner;

public class testingClass {

    static final String RESET = "\u001b[0m";
    static final String RED = "\u001b[1;31m";
    static final String YELLOW = "\u001b[1;33m";
    static final String YELLOW_BRIGHT = "\033[1;93m";
    //static final String GREEN = "\u001b[32m";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        do {
            try {
                System.out.println("Type the mathematical example");
                String str = sc.nextLine();
                if (str.equals("stop")){
                    System.out.println(RED + "The application was closed." + RESET); break;
                }
                Meth meth = new Meth();
                System.out.println(YELLOW + meth.mathOpWithArr(meth.findNum(meth.solvingBrackets(str))) + RESET); // firstly solvig Brackets problem then turning string array to an array of doubles then solving this array
            } catch (Exception e) {
                System.out.println(YELLOW_BRIGHT + "Oops, something went wrong!" +
                       " Try one more time or try another mathematical operation (write \"stop\" to terminate the code)."+ RESET);
            }
            counter++;
        } while (counter > 0);
    }
}
