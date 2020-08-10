package Chap3;

import java.util.Scanner;

public class ParadiseInfo2 {

    public static void main(String[] args) {
        double price;
        double discount;
        double savings;
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter Cutoff Price for Discount>>");
        price = Keyboard.nextDouble();
        System.out.println("Enter Discount Rate as a Whole Number");
        discount = Keyboard.nextDouble();
        savings = computeDiscountInfo(price, discount);
        System.out.println("Special this week on any service over " +
                price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That’s a savings of at least $" + savings);


    }

    private static double computeDiscountInfo(double price, double discount) {
        double savings;
        savings=price*discount/100;
        return savings;


    }
}
