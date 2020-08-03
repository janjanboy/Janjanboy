import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        int Firstnumber;
        int Secondnumber;
        int sum;
        int difference;
        int average;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter an integer>>");
        Firstnumber=input.nextInt();
        System.out.println("Please enter another integer");
        Secondnumber=input.nextInt();
        sum=Firstnumber+Secondnumber;
        difference=Firstnumber-Secondnumber;
        average=sum/2;
        System.out.println(Firstnumber+"+"+Secondnumber+"is"+sum);
        System.out.println(Firstnumber+"-"+Secondnumber+"is"+difference);
        System.out.println("The Average of"+Firstnumber+"and"+Secondnumber+"is"+average);

    } // end main method
} // end class


