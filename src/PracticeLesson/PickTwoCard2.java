package PracticeLesson;



public class PickTwoCard2 {
    public static void main(String[] args) {

        char[] suit01= {'s', 'd', 'h', 'c'};
        int suitlenght=suit01.length;
        int random=(int)(Math.random()*suitlenght);
        char word=suit01[random];

        int min = 1;
        int max = 13;
        int rank01= (int) (Math.random() * max) + min;

        System.out.print("Please enter the suit of the first card ");
        Card2 card=new Card2(word,rank01);


        int min1 = 1;
        int max1 = 13;
        int rank02 = (int) (Math.random() * max1) + min1;

        char[] suit02= {'s', 'd', 'h', 'c'};
        int suitlenght1=suit01.length;
        int random1=(int)(Math.random()*suitlenght1);
        char words=suit01[random1];

        System.out.print("Please enter the suit of the second card ");
        Card2 card1=new Card2(words,rank02);


        if(rank01>rank02){
            System.out.print("First card is higher of rank ");
        }
        else if (rank01<rank02){
            System.out.println("Second card is higher of rank ");
        }
        else{
            System.out.println("It's a tie");
        }

    }
}
