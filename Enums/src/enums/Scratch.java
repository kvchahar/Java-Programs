package enums;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Scratch {
    public static void main(String[] args) {
        // Gregorian Calendar( JDK)
        int currentMonth = new GregorianCalendar().get(Calendar.MONTH);
        System.out.println(currentMonth);
        System.out.println(new GregorianCalendar().getDisplayName(
                Calendar.MONTH,
                Calendar.LONG,
                Locale.ENGLISH
        ));
    }
}
