package PlayGround;

public class Player {
    int number=0;           //Where the guess goes

    public void guess(){     //guess Method (to call)
        number=(int)(Math.random()*10);
        System.out.println("Im guessing "+number);

    }
}
