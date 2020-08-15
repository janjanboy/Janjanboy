package Pangmalakasan;

public class Exercise10 {
    private double radius;
    private double circumference;
    private double diameter;

public double getRadius(){
    return radius;
}
    public void setRadius(double radius1) {

        radius = radius1;
    }

    public double Circumference1() {
        circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public double Diameter1() {
        diameter = radius * 2;
        return diameter;
    }

}