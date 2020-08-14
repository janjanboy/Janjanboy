package Pangmalakasan;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number:");
        int number = input.nextInt();

        System.out.println("Is " + number + " even number? " + (number % 2 == 0));
        System.out.println("Is " + number + " odd number? " + (number % 2 == 1));

    }
}
