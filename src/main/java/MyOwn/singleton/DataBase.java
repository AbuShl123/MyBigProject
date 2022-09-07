package MyOwn.singleton;

public class DataBase {
    private static DataBase dbObject; // we created the object inside the class

    private DataBase() {
    } // private constructor to prevent creating the object outside the class

    public static DataBase getInstance() {
        if (dbObject == null) dbObject = new DataBase();
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You now are connected to Database");
    }
}

class Main {
    public static void main(String[] args) {
        DataBase obj = DataBase.getInstance(); // there is only one instance of the class (it's dbObject)

        obj.getConnection(); // this method cannot be used without creating the object of class.
    }
}
