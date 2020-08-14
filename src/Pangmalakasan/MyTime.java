package Pangmalakasan;

public class MyTime {
    //public static boolean toString;
    private  static int max;
    private static int min;
    private static  int hour= (int) (Math.random()*23);//= (min=0),(max=23)
    private static int minutes= (int) (Math.random()*59);//=(min=0),(max=59)
    private static int seconds= (int) (Math.random()*59);//=(min=0), (max=59)

    //public static int toString(int hour, int minutes, int seconds) {
    //return (hour)(minutes)(seconds);}

    public void sethour(int hour1){

    hour = hour1;
    //toString('0'+hour);
        }

    private void toString(int time) {
    }

    public void setminutes(int minutes1){

    minutes=minutes1;
   //toString('0'+minutes);
        }
public void setseconds(int seconds1){

    seconds=seconds1;
    //toString('0'+seconds);
            }
public static int gethour(){

    return hour;
}
public static int getminutes(){

    return minutes;
}
public static int getseconds(){

    return seconds;
}

}
