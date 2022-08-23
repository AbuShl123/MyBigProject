package CYDEO.days.day35_objeclClass.constructor;

public class TrafficLight {
    private String color;

    public TrafficLight(String inputColor) {
        boolean isValid = inputColor.equalsIgnoreCase("red") || inputColor.equalsIgnoreCase("yellow") || inputColor.equalsIgnoreCase("green");

        if (isValid)
            color = inputColor;
    }

    public String getColor() {
        return color;
    }
}
