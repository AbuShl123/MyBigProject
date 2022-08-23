package CYDEO.mentoring.class_and_object;

public class Main {
    public static void main(String[] args) {

        Pen object = new Pen();

//        object.name = "Sekuz";
//        object.inkColor = "red";
//        object.size = 15;

        object.setName("Sekuz");
        System.out.println(object.name);

        object.writing();
    }
}
