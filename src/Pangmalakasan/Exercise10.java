package Pangmalakasan;

public class Exercise10 {
    private double radius;
    private double circumference;
    private double diameter;

    public void setRadius(double radius1) {

        radius = radius1;
    }

    public double getCircumference() {
        circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public double getDiameter() {
        diameter = radius * 2;
        return diameter;
    }

}