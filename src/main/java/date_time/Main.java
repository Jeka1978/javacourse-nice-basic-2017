package date_time;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;

import java.util.Locale;

/**
 * Created by Evegeny on 22/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println("now = " + dateTime);
        DateTime nextYearDate = dateTime.plusYears(1);
        String china = nextYearDate.dayOfWeek().getAsText(Locale.CHINESE);
        String france = nextYearDate.dayOfWeek().getAsText(Locale.FRANCE);
        System.out.println("china = " + china);
        System.out.println("france = " + france);
        Duration duration = new Duration(dateTime, nextYearDate);
        Days days = duration.toStandardDays();
        System.out.println(days.toString());
    }
}
