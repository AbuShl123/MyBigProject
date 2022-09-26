package myOwn.conceptsOOP.Abstraction.Interface;

interface Enable {
    void start();
}

interface Action1 extends Enable{
    void run(); // object of this interface can do only this action

    int timeForRunning = 30; // it is public and final by default
}

interface Action2 extends Enable{
    void haveBreakfast(); // object of this interface can do only this action

    int timeForLunch = 20; // it is public and final by default
}

interface Action3 extends Enable{
    void goToWork(); // object of this interface can do every 3 actions

    int timeForDrivingToWork = 10; // it is public and final by default
}

interface MorningActions extends Action1, Action2, Action3{ // multiple inheritance
    /** !implementing the methods is not necessary here, it's optional! **/

    int totalTime = timeForRunning + timeForLunch + timeForDrivingToWork; // we can use fields of extended interfaces
    default void atWork() {
        System.out.println("And the day starts!");
    }
    /*
    @Override
    default void start() {
        // this is a start() method from Enable interface, which was automatically extended by MorningActions
    }
    */ // <-- read it
}

class Works implements MorningActions{ // object of this class implements all methods that has MorningActions
    /** implementing the methods is necessary here, otherwise an error will be shown (but not default) **/
    @Override
    public void start() { // since start() was inherited by MorningActions, we must Override it too
        System.out.println("Starting the day!");
    }

    @Override
    public void run() {
        System.out.println("Morning running");
    }

    @Override
    public void haveBreakfast() {
        System.out.println("Having a breakfast");
    }

    @Override
    public void goToWork() {
        System.out.println("Now going to work");
    }
    // since this is a class which implements interfaces, it must contain all methods created in them

    // we cannot use interface's fields, that's way there we have to create new ints and assign them values of those fields.
    public int runningTime = timeForRunning;
    public int breakfastTime = timeForLunch;
    public int drivingTime = timeForDrivingToWork;
    public int totally = totalTime;
}


public class MultipleInheritance {
    public static void main(String[] args) {
        Works obj = new Works();
        obj.start();
        obj.run();
        System.out.println(obj.runningTime + " min");
        obj.haveBreakfast();
        System.out.println(obj.breakfastTime + " min");
        obj.goToWork();
        System.out.println(obj.drivingTime + " min");
        obj.atWork();
        System.out.println("\nTotally: " + obj.totally + " min");

        System.out.println("-------------------------");
        Action1 obj2 = new Works();
        obj2.run(); //only run... and no timing


        System.out.println("-------------------------");
        Action2 obj3 = new Works();
        obj3.haveBreakfast(); // only having lunch... and no timing


        System.out.println("-------------------------");
        Action3 obj4 = new Works();
        obj4.goToWork(); // only going to work... and no timing


        System.out.println("-------------------------");
        MorningActions obj5 = new Works();
        obj5.run(); obj5.haveBreakfast(); obj5.goToWork(); obj5.atWork(); // can do everything but still no timing


    }
}
