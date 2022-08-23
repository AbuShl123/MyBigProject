package MyOwn.list;

import java.util.ArrayList;
import java.util.List;

class Book {
    private final String title;
    private final float price;

    public Book (String title, float price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public float getPrice() {
        return price;
    }
}


public class ListOfObjects {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        Book b1 = new Book("Python Tutorial", 100f);
        Book b2 = new Book("HTML Tutorial", 120f);

        List<Book> bookList1 = List.of(b1,b2);

        bookList.add(new Book("Java Tutorial", 200f));
        bookList.add(new Book("C# Tutorial", 300f));

        for (Book book: bookList) {
            System.out.println(book.getTitle() + " / " + book.getPrice());
        }
    }
}


