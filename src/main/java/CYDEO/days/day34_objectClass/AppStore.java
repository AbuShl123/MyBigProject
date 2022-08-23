package CYDEO.days.day34_objectClass;

public class AppStore {
    public static void main(String[] args) {

        App instagram = new App();
        instagram.name = "Instagram";
        instagram.version = 12.1;
        instagram.isFree = true;
        instagram.ratings = 4;

        instagram.update(); // calling instance method by the object/reference

//        System.out.println(instagram.name);
//        System.out.println(instagram.version);
//        System.out.println(instagram.isFree);
//        System.out.println(instagram.ratings);

        System.out.println(instagram); // now we wrote toString, and we can do like that
    }
}
