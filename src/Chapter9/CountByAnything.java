package Chapter9;
import java.util.Scanner;
public class CountByAnything {
    public static void main(String[] args) {
Scanner input= new Scanner(System.in);
        System.out.println("Please Enter the interval ");
        int countBy=input.nextInt();
        for(int number= countBy;number<=500;number=number+countBy){
            if(number%(countBy*10)==0)
                System.out.println(number);
            else System.out.print(number+", ");
        }
    }
}
