package Chapter7;

public class SwitchCase2Main {
    public static void main(String[] args) {

        int minchar = 1;
        int maxchar = 4;
        int suit = (int) (Math.random() * maxchar) + minchar;

        int min = 1;
        int max = 13;
        int rank = (int) (Math.random() * max) + min;
        System.out.println("Please Enter the First card ");
        SwitchCase2 swits = new SwitchCase2(suit,rank);

        int minchar1=1;
        int maxchar1=4;
        int suit01=(int) (Math.random() * maxchar1) + minchar1;

        int minrank = 1;
        int maxrank = 13;
        int rank01 = (int) (Math.random() * maxrank) + minrank;
        System.out.println("Please enter the second card ");
        SwitchCase2 swits1=new SwitchCase2(suit01,rank01);

        if(rank>rank01){
            System.out.println("Card 1 Wins");
        }
        else if (rank<rank01){
            System.out.println("Card 2 Wins");

        }
        else {
            System.out.println("It's a tie ");
        }

    }
}
