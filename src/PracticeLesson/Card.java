package PracticeLesson;

public class Card {

    private char suit;
    private int rank;

    public Card(char suit, int rank) { //Constructor, receive from the objects in Main
        this.suit = suit;
        this.rank = rank;


        if (this.suit == 's') {
            System.out.println("spade");
        } else if (this.suit == 'h') {
            System.out.println(rank + " heart");
        } else if (this.suit == 'd') {
            System.out.println(rank + " diamond");

        } else if (this.suit == 'c') {
            System.out.println(rank + " clubs");
        } else {
            System.out.println("Error");
        }


    }


    public String toString() {

        return String.valueOf(rank)+ String.valueOf(suit);
    }
}
