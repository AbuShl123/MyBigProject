package CYDEO.days.day42_abstraction.exercize;

public class Running extends Exercise{

    @Override
    public void perform() {
        System.out.println("We are running");
    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(minutes * 3.35);
    }

    /*
    Running is an exercise
    Running is non-abstract (normal class)
    because Running is first non-abstract it is concrete class

    Concrete classes implement (override) all the abstract methods
     */

}
