package Pangmalakasan;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a Value ");
        double value = input.nextDouble();

        System.out.println("Square is " + value * value);
        System.out.println("Cube is " + value * value * value);
        System.out.println("Cube is "+ value*value*value*value);
        //System.out.println("Fourth power is " + Math.pow(value, 4));
    }
}
