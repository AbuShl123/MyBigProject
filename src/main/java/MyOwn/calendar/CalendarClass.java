package MyOwn.calendar;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class CalendarClass {
    public static void main(String[] args) {


        System.out.println(findDay(8, 5, 2015));
    }

    public static String findDay(int month, int day, int year) {
        Calendar time = Calendar.getInstance();
        time.set(Calendar.MONTH, month-1);
        time.set(Calendar.DAY_OF_MONTH, day);
        time.set(Calendar.YEAR, year);
        Map<String, String> map = new HashMap<>();
        map.put("Mon", "MONDAY");
        map.put("Tue", "TUESDAY");
        map.put("Wed", "WEDNESDAY");
        map.put("Thu", "THURSDAY");
        map.put("Fri", "FRIDAY");
        map.put("Sat", "SATURDAY");
        map.put("Sun", "SUNDAY");
        return map.get(time.getTime().toString().substring(0,3));
    }

}
