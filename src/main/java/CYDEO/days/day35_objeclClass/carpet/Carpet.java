package CYDEO.days.day35_objeclClass.carpet;

public class Carpet {
    double width, length, unitPrice, totalPrice;
    boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        calculatePrice();
    }

    public void calculatePrice() {
        totalPrice = width * length + unitPrice;
        if (isPersian) totalPrice+= 200;

    }



    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}
