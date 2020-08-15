package Pangmalakasan;

public class MyTime {

    private static int hour = (int) (Math.random() * 23) + 1;
    private static int minutes = (int) (Math.random() * 59) + 1;
    private static int seconds = (int) (Math.random() * 59) + 1;

    public static int gethour() {

        return hour;
    }

    public static int getminutes() {

        return minutes;
    }

    public static int getseconds() {

        return seconds;
    }

    public void sethour(int hour1) {

        hour = hour1;

    }

    public void setminutes(int minutes1) {

        minutes = minutes1;

    }

    public void setseconds(int seconds1) {

        seconds = seconds1;

    }
public String toString(){
    String oras=hour<10?("0"+hour):String.valueOf(hour);
    String minuto=minutes<10?("0"+minutes):String.valueOf(minutes);
    String segundo=seconds<10?("0"+seconds):String.valueOf(seconds);

    return "This is the time: "+ oras+":"+minuto+":"+segundo;

}
}
