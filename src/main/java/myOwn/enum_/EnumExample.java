package myOwn.enum_;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EnumExample {
    OBJ1("Murphy"), OBJ2("Aphrodite"), OBJ3("Loki");

    private final String name;
}

class getAtr {
    public static void main(String[] args) {
        EnumExample var1 = EnumExample.OBJ1;
        System.out.println(var1.getName());
        System.out.println(EnumExample.OBJ2.getName());


        for (EnumExample enums : EnumExample.values()) {
            System.out.println(enums.getName());
        }
    }
}