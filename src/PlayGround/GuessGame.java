package PlayGround;

public class GuessGame { // 3 Instance Variables for 3 Player Objects
    Player p1;                 //From Player.java
    Player p2;
    Player p3;

    public void startGame() {  // 3 Player Objects,assigned to the 3 Player Instance Variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;           // 3 Variables to hold the 3 guesses the Players make
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;   // 3 Variables to hold a true or false based on the players answer
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);            //Target Number to guess
        System.out.println("Im thinking of a number between 0-9......");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();                      //calling each players guess() Method
            p2.guess();
            p3.guess();

            guessp1 = p1.number;  //     (Player.java int number=0;)
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);


            if (guessp1 == targetNumber) {         //check each player’s guess to see if it matches
                p1isRight = true;                //     the target number. If a player is right,
            }                                    //      then set that player’s variable to be true
                                                 //      (remember, we set it false by default)
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner ");
                System.out.println("Player one got it right " + p1isRight);
                System.out.println("Player two got it right " + p2isRight);
                System.out.println("Player three got it right " + p3isRight);
                System.out.println("Game is Over");
                break;                                     //Game Over so Break out of the loop
            } else {
                System.out.println(" Players will have to try again ");
            }//end if/else
        }//end loop

    }//end of method

}//end of class
