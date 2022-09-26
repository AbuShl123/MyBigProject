package myOwn.constructors;

public class Constructor_inside {  // dead inside
    char mark;
    double size;
    public Constructor_inside(Properties pr) {
        this.mark = pr.mark;
        this.size = pr.size;
    }

    public static class Properties {
        char mark;
        double size;

        public Properties(char mark, double size) {
            this.mark = mark;
            this.size = size;
        }

        public Constructor_inside done() {
            return new Constructor_inside(this);
        }
    }

    @Override
    public String toString() {
        return "Mark: \"" + mark + "\"" + "\nsize: " + size + "cm";
    }

    public static void main(String[] args) {
        Constructor_inside obj = new Constructor_inside.Properties('@', 124.45).done();
        System.out.println(obj);
    }
}
