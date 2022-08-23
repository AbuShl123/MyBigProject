package CYDEO.days.day36_customClass.song;

public class Song {
    String name;
    double length;
    String composer;
    String genre;

    public Song(String name, double length, String composer, String genre) {
        this.name = name;
        this.length = length;
        this.composer = composer;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + composer + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
