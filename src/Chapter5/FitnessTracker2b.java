package Chapter5;
import java.time.LocalDate;
public class FitnessTracker2b {
    private String activity;
    private int minutes;
    private String date;
    LocalDate year = LocalDate.now();

    public FitnessTracker2b(String activity, int minutes, String date, LocalDate year) {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
        this.year = year;

        }
    public void fit () {
        System.out.println("Fitness Activity is " + activity + "\n" + "Spent Minutes is " + minutes + "\n"
                + "Year is " + date + year.getYear());
    }
}
