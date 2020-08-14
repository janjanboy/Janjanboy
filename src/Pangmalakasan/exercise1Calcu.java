package Pangmalakasan;

import java.util.Scanner;

public class exercise1Calcu {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an Integer");
        num1 = input.nextInt();
        System.out.println("Enter another Integer");
        num2 = input.nextInt();
        System.out.println("Addition result is " + " " + (num1 + num2));
        System.out.println("Subtraction result is " + " " + (num1 - num2));
        System.out.println("Multiplication result is " + " " + (num1 * num2));
        System.out.println("Division Result is " + " " + (num1 / num2));

    }

}
