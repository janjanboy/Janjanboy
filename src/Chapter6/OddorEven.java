package Chapter6;
import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter an Interger:");
        int number = input.nextInt();
        int modulo = number % 2;
        if (modulo == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
