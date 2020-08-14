package Pangmalakasan;

import java.util.Scanner;

public class Exercise9 {

    private static int num1;
    private static int num2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter an Integer: ");
        num1 = input.nextInt();
        System.out.print("Please Enter another Integer: ");
        num2 = input.nextInt();

        Addition();
        Subtraction();
        Multiplication();
        Division();

    }


    public static void Addition() {
        System.out.println("Addition result is >> " + (num1 + num2));
    }

    public static void Subtraction() {
        System.out.println("Subtraction result is >> " + (num1 - num2));
    }

    public static void Multiplication() {
        System.out.println("Multiplication result is >> "
                + (num2 * num2));
    }

    public static void Division() {
        System.out.println("Division result is >> "
                + (num1 / num2));
    }
}
