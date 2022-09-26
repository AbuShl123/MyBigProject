package myOwn.enum_.enumPractice;

import lombok.Getter;

@Getter
public enum Enum {
    OBJ1 (12), OBJ2(4);

    private final int age;
    Enum(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
