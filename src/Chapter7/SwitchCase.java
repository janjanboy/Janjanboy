package Chapter7;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1= Heart\n2= Spade\n3= Club\n4= Diamond\n");
        System.out.print("Please enter a number:");
        int chosenNumber = input.nextInt();
        String selection = "\nYou selected";

        switch (chosenNumber) {
            case 1:
                System.out.println(selection + " Heart ");
                break;
            case 2:
                System.out.println(selection + " Spade ");
                break;
            case 3:
                System.out.println(selection + " Club ");
                break;
            case 4:
                System.out.println(selection + " Diamond ");
            default:
                System.out.println("");
        }


    }
}

