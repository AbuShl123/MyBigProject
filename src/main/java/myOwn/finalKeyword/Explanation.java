package myOwn.finalKeyword;

public class Explanation {
    final int s = 14;

    public static void main(String[] args) {
        final int a = 12; // final means once it declared then it will never be changed;
        System.out.println(a);
//      a = 14; // shows an error


        int b = 12;  // this is not final, so we can manipulate with it;
        b = 14;


        b = a +3;  // this works
//      a = b-1;   // but this don't

        Explanation finalNum = new Explanation();
//      finalNum.s = 2; // this will show an error too



        System.out.println(Exm(12)); // not error
    }
    public static int Exm(final int a) {
//      a = 12; // error
        return a;
    }

    public final void finalMethod(){
        System.out.print("Base");
    }
}

class Derived extends Explanation {
//  public final void finalMethod() { //Overriding the final method throws an error
//      System.out.print("Derived");
//  }
}


final class finalClass {
    // just exists
} // let's create a subclass for this final class

//  class subClass extends finalClass {}  //ERROR   ---   final classes cannot be subclassed
