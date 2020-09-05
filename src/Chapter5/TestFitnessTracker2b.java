package Chapter5;
import java.time.LocalDate;
public class TestFitnessTracker2b {
    public static void main(String[] args) {
        FitnessTracker2b fitness=new FitnessTracker2b("Hiking",10,"February 2 ",LocalDate.now());
        fitness.fit();
    }
}
