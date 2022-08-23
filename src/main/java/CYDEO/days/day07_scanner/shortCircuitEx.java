package CYDEO.days.day07_scanner;

public class shortCircuitEx {
    public static void main(String[] args) {
        //System.out.println(true && 5/0 == 0); // that will be an exception
        System.out.println(false && 5/0 == 0); // that will not be an exception

        //System.out.println(false & 5/0 == 0); // but THAT will be an exception!!

        System.out.println(true || 5/0 == 0);
        System.out.println(true | 5/0 == 0);

        //    && -- executes everything
        //    &  -- executes until true part is found
        //    the same with || and |


        int count = 0;
        System.out.println(true || count++ == 1); // pc will not read the part that fallows after ||
        System.out.println(count);
    }
}
