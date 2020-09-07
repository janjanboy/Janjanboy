package chapter4;

public class DemoOverload {
    public static void main(String[] args) {
        //int month=6,day=24,year=2019;
        displayDate(6);
        displayDate( 6,24);
        displayDate(6,24,2019);

    }

public static void displayDate(int mm) {
    System.out.println("Event date "+mm+"/1/2018 ");
    }
    public static void displayDate(int mm, int dd){
        System.out.println("Event date "+mm +"/"+dd+"/2018 ");

    }
    public static void displayDate(int mm,int dd,int yy) {
        System.out.println("Event date "+mm+"/"+dd+"/"+yy);
    }
}
