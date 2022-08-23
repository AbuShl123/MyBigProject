package CYDEO.days.day39_inheritance.library;

public class Book {

    String title;
    String author;
    String genre;
    int chapters;
    int pages;
    boolean hasMovie;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", chapters=" + chapters +
                ", pages=" + pages +
                ", hasMovie=" + hasMovie +
                '}';
    }

}
