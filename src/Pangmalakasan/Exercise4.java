package Pangmalakasan;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String numero = number % 2 == 0 ? number +
                " is an even number" : number + " is an odd number";
        System.out.println(numero);
    }
}
