package Pangmalakasan;

import java.util.Scanner;

public class Exercise10B {
    public static void main(String[] args) {
        double radius;

        Exercise10 circle = new Exercise10();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Raduis: ");
        radius = input.nextDouble();
        circle.setRadius(radius);
        System.out.println("Circumference = " + circle.Circumference1());
        System.out.println("Diameter = " + circle.Diameter1());


    }
}
