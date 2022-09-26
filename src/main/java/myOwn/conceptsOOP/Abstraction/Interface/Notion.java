package myOwn.conceptsOOP.Abstraction.Interface;

public interface Notion {
    int sec = 60;  // --> public static final      by default
    int calculate(int a);  // --> public abstract     by default
}

class ToMinutes implements Notion{
    @Override
    public int calculate(int a) {
        return Notion.sec*a;
    }
}

class FromMinutes implements Notion{
    public int calculate(int a) {
        return a/Notion.sec;
    }
}

class Using {
    public static void main(String[] args) {
        Notion n = new ToMinutes();
        System.out.println(n.calculate(12));

        Notion s = new FromMinutes();
        System.out.println(s.calculate(120));
    }
}
