package CYDEO.days.day39_inheritance.library;

public class EBook extends Book{

    double size; // mb
    boolean onKindle;

    @Override
    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", chapters=" + chapters +
                ", pages=" + pages +
                ", hasMovie=" + hasMovie +
                ", size=" + size +
                ", onKindle=" + onKindle +
                '}';
    }
}
