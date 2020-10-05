package PracticeLesson;

public class Card2 {
    private char suit01;
    private int rank01;

    public Card2(char suit, int rank) {
        this.suit01 = suit;
        this.rank01= rank;

        char[] suit01= {'s', 'd', 'h', 'c'};
        int suitlenght=suit01.length;
        int random=(int)(Math.random()*suitlenght);
        char word=suit01[random];

        if (word== 's') {
            System.out.println(rank01+"spade");
        } else if (word== 'h') {
            System.out.println(rank01+ " heart");
        } else if (word == 'd') {
            System.out.println(rank01+ " diamond");

        } else if (word == 'c') {
            System.out.println(rank01 + " clubs");
        } else {
            System.out.println("Error");
        }



    }
    public String toString() {

        return String.valueOf(rank01)+ String.valueOf(suit01);
    }
}
