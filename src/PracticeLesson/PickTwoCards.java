package PracticeLesson;
import java.util.Scanner;
public class PickTwoCards {
    public static void main(String[] args) {

        int min = 1;
        int max = 13;
        int rank = (int) (Math.random() * max) + min;

        Scanner input=new Scanner(System.in);

        System.out.print("Please enter the suite of the first card ");
        char firstsuite=input.next().charAt(0);         //input
        Card card=new Card(firstsuite,rank);            //pass to constructor

        System.out.println("\n");

        int min1 = 1;
        int max1 = 13;
        int rank1 = (int) (Math.random() * max1) + min1;

       System.out.print("Please enter the suite of the second card ");
       char secondsuite=input.next().charAt(0);        //input
       Card card1=new Card(secondsuite,rank1);        //pass to constructor

        System.out.println("\n");


        //Compared Below
       if(rank>rank1){
           System.out.print("First card is higher of rank ");
       }
       else if (rank<rank1){
           System.out.println("Second card is higher of rank ");
       }
       else{
           System.out.println("It's a tie");
       }
    }


}
