package Pangmalakasan;
import java.util.Scanner;
public class TestMyTime {
    public static void main(String[] args) {
int hour;
int minutes;
int seconds;
MyTime clock=new MyTime();
Scanner input=new Scanner(System.in);
        System.out.print("Enter Hour: ");
        hour=input.nextInt();
        clock.sethour(hour);
        System.out.print("Enter minutes: ");
        minutes=input.nextInt();
        clock.setminutes(minutes);
        System.out.print("Enter seconds: ");
        seconds=input.nextInt();
        clock.setseconds(seconds);

            //Object toString=clock;
            System.out.println(clock.toString());


    }

}
