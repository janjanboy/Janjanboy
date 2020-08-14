import java.util.Scanner;

class FirstExercise1 {
    public static void main (String[] args) {

        int age = 20;
        String ageGroup = "";
        ageGroup = age < 13 ? " matanda " : ageGroup;
        ageGroup = age < 19 ? "teenager" : "matanda";
    }

}
