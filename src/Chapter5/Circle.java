package Chapter5;

public class Circle {
private double radius;
private double diameter;
private double area;




    public Circle() {
        this.radius=radius=1;
        diameter=radius*2;
        area= (double) (Math.PI*(radius*radius));
    }


    public double getRadius(){
    return 1;
}


    public String setRadius() {
        this.radius=radius;
        diameter=radius*2;
        area= (double) (Math.PI*(radius*radius));
        String answer=" Radius is "+radius+" \n Diameter is "+diameter+" \n Area is "+area;
        return String.valueOf(answer);
    }
}
