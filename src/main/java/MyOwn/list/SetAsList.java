package MyOwn.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetAsList {
    public static void main(String[] args) {
        Book b1 = new Book("Python Tutorial", 100f);
        Book b2 = new Book("HTML Tutorial", 120f);
        Book b3 = new Book("Java Tuorial", 300f);

        Book[] bookArray = new Book[]{b1,b2,b3};

        ArrayList<Book> BookList = new ArrayList<>(Arrays.asList(bookArray));

        for (Book b : BookList) {
            System.out.println(b.getTitle() + " / " + b.getPrice());
        }
    }
}

