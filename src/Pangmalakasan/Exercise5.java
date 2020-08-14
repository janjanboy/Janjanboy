package Pangmalakasan;

import java.awt.*;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number;
        float hour;
        float minutes;
        float seconds;
        System.out.print("Please enter distance in meters: ");
        number = input.nextFloat();
        System.out.print("Please Enter hour: ");
        hour = input.nextFloat();
        System.out.print("Please enter minutes: ");
        minutes = input.nextFloat();
        System.out.print("Please enter seconds: ");
        seconds = input.nextFloat();
        float mps = (number / ((hour * 60 * 60) + (minutes * 60) + seconds));
        float kph = (float) (mps * 3.6);
        float mph = (float) (kph / 1.609);
        System.out.println("Your speed in meters/seconds is " + mps);
        System.out.println("Your speed in km/hour is " + kph);
        System.out.println("Your speed in miles/hour is " + mph);
    }
}
