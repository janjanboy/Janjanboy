package Chapter8;

import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {

        String[] rps = {"Rock", "Paper", "Scissors"};
        int comp = ((int) Math.random() * 3) + 1;

        Scanner user = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String player = user.nextLine();
        System.out.println("Hi " + player + " please choose(0-Rock, 1 Paper, 2 -Scissors) ");
        int playerGuess = user.nextInt();



        while (!(comp == 3 && playerGuess == 1 || comp == 2 && playerGuess == 1
                || comp == 3 && playerGuess == 2)) {

            if (comp == playerGuess) {
                System.out.println("Computer picks " + rps[comp] + " " + player + " picks " +
                        rps[playerGuess] +" Its a tie. Try again ");

            } else {

                System.out.println("Computer picks " + rps[comp] + " " + player + " picks " +
                        rps[playerGuess]+" Computer Wins. Try Again!");
            }
            System.out.println("Hi " + player + " please choose again (0-Rock, 1 Paper, 2 -Scissors)");
            int playerGuess1 = user.nextInt();
            int comp1 = ((int) Math.random() * 3) + 1;


            {
                System.out.println("Computer picks " + rps[comp] + " " + player + " picks "
                        + rps[playerGuess] + player + " wins");

            }

        }


    }
}
