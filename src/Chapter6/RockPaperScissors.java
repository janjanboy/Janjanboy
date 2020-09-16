package Chapter6;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        Scanner input = new Scanner(System.in);


        System.out.print("Player 1 please enter your name: ");
        String player1 = input.nextLine();
        System.out.print("Player 2 please enter your name: ");
        String player2 = input.nextLine();
        System.out.println("\n");

        System.out.print("Hello " + player1 + " please choose(1-Rock, 2-Paper, 3-Scissors) ");
        int guess1 = input.nextInt();

        System.out.print("Hello " + player2 + " please choose(1-Rock, 2-Paper, 3-Scissors) ");
        int guess2 = input.nextInt();

        System.out.println("\n");
        if (guess1 == rock && guess2 == paper) {

            System.out.println(player2 + " wins");
        } else if (guess1 == paper && guess2 == scissors) {
            System.out.println(player2 + " wins");
        } else if (guess1 == scissors && guess2 == rock) {
            System.out.println(player2 + " wins");
        } else if (guess1 == rock && guess2 == scissors) {
            System.out.println(player1 + " wins ");

        } else if (guess1 == paper && guess2 == rock) {
            System.out.println(player1 + " wins");
        } else if (guess1 == scissors && guess2 == paper) {
            System.out.println(player1 + " wins");
        } else {
            System.out.println("Its a tie ");
        }
    }
}
