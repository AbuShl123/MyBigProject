package CYDEO.mentoring.mentoring0709_practicing_OOP;

import java.util.ArrayList;

public class DataBase {
    private static DataBase dataBase;

    public ArrayList<String> names = new ArrayList<>();

    private DataBase() {}

    public static DataBase getInstance(){
        if (dataBase == null) {
            dataBase = new DataBase();
        }
        return dataBase;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "names=" + names +
                '}';
    }
}
