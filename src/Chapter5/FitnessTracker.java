package Chapter5;

import java.time.LocalDate;

import java.time.LocalDate;

public class FitnessTracker {
public String activity="Running";
public int minutes= 0;
public String date=" January 1 ";
LocalDate year=LocalDate.now();


public LocalDate getYear(){
return year;
}
public String toString(){
        String completeYEar=date+year.getYear();
    String fit="Fitness Activity is "+activity+"\n"+"Spent Minutes is "+minutes+"\n"+"Year is "+completeYEar;
    return String.valueOf(fit);
}
}
