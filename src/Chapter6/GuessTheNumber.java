package Chapter6;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int min=1;
        int max=10;
        int number=input.nextInt();
        int random=(int)(Math.random()*max)+min;

        System.out.println(random);

        if(number==random){
            System.out.println("Your guess is correct");
        }
else if (number>random){
            System.out.println("Your guess is higher");
        }
else{
            System.out.println("Your guess is lower");
        }
    }
}
