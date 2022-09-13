package CYDEO.days.day43_abstraction.animal;

public class AllAnimals {



}

class Cat extends Animal implements Friendly {

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void pet() {

    }

    @Override
    public void play() {

    }
}

class Shark extends Animal implements Swimmable{

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void swin() {

    }
}

class fish extends Animal implements Swimmable, Petable{

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void pet() {

    }

    @Override
    public void swin() {

    }
}

class Bird extends Animal implements Flyable, Friendly{

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void pet() {

    }

    @Override
    public void play() {

    }
}

class Duck extends Animal implements Flyable, Swimmable{

    @Override
    public void eat() {
        
    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swin() {

    }
}