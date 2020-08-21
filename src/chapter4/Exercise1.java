package chapter4;

public class Exercise1 {
    public static void main(String[] args) {

sum(1,2);
sum(1,2,3);
sum(1,2,3,4);
sum(1,2,3,4,5);

    }
private static int sum(int num1, int num2){
    int answer=num1+num2;
    System.out.println(answer);
   return answer;

}
private static int sum(int num1,int num2,int num3){
    int answer=num1+num2+num3;
    System.out.println(answer);
    return answer;
}
private static int sum(int num1,int num2,int num3,int num4){
    int answer=num1+num2+num3+num4;
    System.out.println(answer);
    return answer;
}
private static int sum(int num1,int num2,int num3,int num4,int num5){
    int answer=num1+num2+num3+num4+num5;
    System.out.println(answer);
    return answer;
}
}
