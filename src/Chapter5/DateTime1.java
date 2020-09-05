package Chapter5;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTime1 {
    LocalDateTime time = LocalDateTime.now(ZoneId.of("GMT+8"));
    private int hour;
    private int minutes;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minutes;

    }

    @Override
    public String toString() {
        String hour = time.getHour() < 10 ? ("0" + time.getHour()) : String.valueOf(time.getHour());
        String minutes = time.getMinute() < 10 ? ("0" + time.getMinute()) : String.valueOf(time.getMinute());
        String clock = hour + ":" + minutes ;
        return "Current Time is " + clock;
    }
}
