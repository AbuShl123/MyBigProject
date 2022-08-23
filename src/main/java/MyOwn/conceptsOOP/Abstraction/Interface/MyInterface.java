package MyOwn.conceptsOOP.Abstraction.Interface;

public interface MyInterface {
    int num = 100;
    void display();
}

class InterfaceClass implements MyInterface {
    public static int num = MyInterface.num + 12;
    @Override
    public void display() {
        System.out.println("It is display method");
    }
}


