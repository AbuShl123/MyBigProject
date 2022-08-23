package CYDEO.days.day39_inheritance.library;

public class AudioBook extends Book {

    String narrator;
    double duration;

    @Override
    public String toString() {
        return "AudioBook{" +
                "narrator='" + narrator + '\'' +
                ", duration=" + duration +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", chapters=" + chapters +
                ", pages=" + pages +
                ", hasMovie=" + hasMovie +
                '}';
    }
}

// AudioBook is a Book

// How many instances variable does AudioBook objects have access to?
// > have 6 from super class
// > plus 2 from its class, so total of 8