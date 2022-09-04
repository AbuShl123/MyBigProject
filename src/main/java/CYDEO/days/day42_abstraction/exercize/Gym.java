package CYDEO.days.day42_abstraction.exercize;

public class Gym {
    public static void main(String[] args) {
        // Exercise obj = new Exercise(); is not valid because exercise is abstract and cannot be instantiated

        Exercise obj = new Running();
        obj.perform();
        obj.getCaloriesBurned(10);

        Running run = new Running();
        run.perform();
        run.getCaloriesBurned(30);

//        Lifting obj = new Lifting(); lifting is abstract class so that's why we cannot create the object of this class

        Bench benching = new Bench();
        benching.perform();
        benching.getCaloriesBurned(26);
        benching.rackWeights();
    }
}
