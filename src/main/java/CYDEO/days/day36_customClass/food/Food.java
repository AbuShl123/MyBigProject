package CYDEO.days.day36_customClass.food;

public class Food {
    String name;
    int quantity;
    double unitPrice, totalPrice;

    public Food(String name) {
        this.name = name;
    }

    public Food(String name, int quantity) {
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice) {
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public boolean calculatePrice() {
        if (unitPrice <= 0 || quantity <= 0) {
            return false;
        }
        totalPrice = unitPrice * quantity;
        return true;
    }

    public String toString() {
        String str = "Name=" + name;
        if (quantity != 0) str += ", Quantity=" + quantity;
        if (unitPrice != 0) str += ", Unit price=" + unitPrice;
        if (totalPrice != 0) str += ", Total price=" + totalPrice;

        return " < " + str + " > ";
    }
}
