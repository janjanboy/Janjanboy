package Chapter8;
import java.util.Scanner;
public class PickANumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1=input.nextInt();
        int number=0;

        while(number != number1){
            System.out.println(number);
            number++;
        }
    }
}
