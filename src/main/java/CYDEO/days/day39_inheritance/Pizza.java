package CYDEO.days.day39_inheritance;

public class Pizza {
    private String size;
    private int numberOfToppings;

    public Pizza() {}

    public Pizza(String size, int numberOfToppings) {
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equals("small") || size.equals("medium") || size.equals("large")) {
            this.size = size;
        }
    }
    // we encapsulated size. We can access them only through get or set methods

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int t) {
        if (t >= 0) {
            numberOfToppings = t;
        }
    }

    public double calculatePrice() {
        if (size != null) {
            return numberOfToppings * .75 + (size.equals("easy?") ? 4 : size.equals("medium") ? 6 : 8);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfToppings=" + numberOfToppings +
                '}';
    }
}
