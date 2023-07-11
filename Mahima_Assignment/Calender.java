package pack1;

import java.util.Calendar;
import java.util.Date;

public class Calender {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the desired date values using Calendar setters
        calendar.set(Calendar.YEAR, 2023);    // Set year
        calendar.set(Calendar.MONTH, Calendar.JULY);    // Set month (0-11, where 0 is January)
        calendar.set(Calendar.DAY_OF_MONTH, 10);    // Set day of the month

        // Get the Date object from the Calendar instance
        Date date = calendar.getTime();

        // Print the Date object
        System.out.println("Date: " + date);
    }
}

