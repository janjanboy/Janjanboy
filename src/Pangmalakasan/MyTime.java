package Pangmalakasan;

public class MyTime {

    private static int[] hour= new int[]{0, 1, 2, 3, 4, 5, 6,7,8,9,10,11,12};
    private static int[] minutes=new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27,28,29,30,
            31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59};
    private static int[] seconds=new int [] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27,28,29,30,
            31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59};

    int hawar=hour.length;
    int menits=minutes.length;
    int sakonds=seconds.length;

    int hawar1=(int)(Math.random()*hawar);
    int menits1=(int)(Math.random()*sakonds);
    int sakonds1=(int)(Math.random()*sakonds);


    //public static int[] gethour() {

        //return hour;
    //}

   // public static int[] getminutes() {

       // return minutes;
   // }

   // public static int[] getseconds() {

      //  return seconds;
   // }

  //  public void sethour(int[] hour1) {
    //    int hawar1=(int)(Math.random()*hawar);
     // hour = hour1;

    //}

   //public void setminutes(int[] minutes1) {
    //    int menits1=(int)(Math.random()*sakonds);
     // minutes = minutes1;

    //}

    //public void setseconds(int[] seconds1) {
     //   int sakonds1=(int)(Math.random()*sakonds);

        //seconds = seconds1;

    //}
public String toString(){
    String oras=hawar1<10?("0"+ hawar1):String.valueOf(hawar1);
    String minuto=menits1<10?("0"+ menits1):String.valueOf(menits1);
    String segundo=sakonds1<10?("0"+ sakonds1):String.valueOf(sakonds1);
    String all=oras+":"+minuto+":"+segundo;
    return String.valueOf (all);

}
}
