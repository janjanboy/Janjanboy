package Chapter7;

public class SwitchCase2 {
private int suit1;
private int rank1;

public SwitchCase2(int suit,int rank){
    this.suit1=suit;
    this.rank1=rank;

    int minchar=1;
    int maxchar=4;
    int suit1=(int) (Math.random() * maxchar) + minchar;
    int min=1;
    int max=13;
    int rank1=(int) (Math.random() * max) + min;


    switch (suit1) {
        case 1:
            System.out.println(rank + " spade");
        case 2:
            System.out.println( rank + " hearts");
        case 3:
            System.out.println(rank+ " diamond");
        case 4:
            System.out.println(rank+" club");
        default:
            System.out.println("");
    }


}
public String toString(){


    return String.valueOf(this.rank1)+ String.valueOf(this.suit1);
}
}
