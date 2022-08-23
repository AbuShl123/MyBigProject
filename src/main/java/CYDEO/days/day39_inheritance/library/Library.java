package CYDEO.days.day39_inheritance.library;

import java.util.List;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.author = "James Clear";
        book1.title = "Atomic Habits";
        // book1 has access to 6 variables: author, hasMovie, title, genre, chapters, numberOfPages

        AudioBook book2 = new AudioBook();
        book2.duration = 45.69;
        book2.narrator = "James Bond";
        book2.hasMovie = true;
        // book2 has access to 8 variables: all the variables from parent Book class and the 2 variables declared in the AudioBook class

        EBook book3 = new EBook();
        book3.size = 24.56;
        book3.onKindle = true;
        //book3.narrator  the narrator was a variable declared in the AudioBook class
        // book3 has access to 8 variables: all the variables from parent Book class and the 2 variables declared in the AudioBook class


        List<Book> books = List.of(book1, book2, book3);
        for (Book book : books) {
            System.out.println(book);
        }


    }
}
