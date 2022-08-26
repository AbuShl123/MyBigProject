package CYDEO.days.day40_inheritance.app;

public class Phone {
    public static void main(String[] args) {

        YouTube youtube = new YouTube(4.8);

        System.out.println(youtube.name);
        System.out.println(youtube.version);
        youtube.download();
        youtube.watchVideo();
    }
}
