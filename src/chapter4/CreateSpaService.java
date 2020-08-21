package chapter4;

import java.util.Scanner;

public class CreateSpaService {
    public static void main(String[] args) {
        String service;
        double price;
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Service>> ");
        service = keyboard.nextLine();
        System.out.print("Enter Price>> ");
        price = keyboard.nextDouble();
        firstService.setServiceDescription(service);
        firstService.setPrice(price);
        //keyboard.nextLine();
        // System.out.print("Enter Service>> ");
        //service = keyboard.nextLine();
        //System.out.print("Enter PRice>> ");
        //price = keyboard.nextDouble();
        //secondService.setServiceDescription(service);
        //secondService.setPrice(price);
        System.out.println("First Service Details");
        System.out.println(firstService.getServiceDescription() +
                " $ " + firstService.getPrice());
        System.out.println("Second Service Details ");
        System.out.println(secondService.getServiceDescription() +
                " $ " + secondService.getPrice());

    }
}
