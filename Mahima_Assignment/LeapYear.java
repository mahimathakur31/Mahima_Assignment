package pack1;

import java.time.Year;

public class LeapYear {
    public static void main(String[] args) {
        // Get the current year
        Year currentYear = Year.now();

        // Get the year value
        int year = currentYear.getValue();

        // Check if the year is a leap year
        boolean isLeapYear = currentYear.isLeap();

        // Get the length of the year
        int yearLength = currentYear.length();

        // Display the information
        System.out.println("Current Year: " + year);
        System.out.println("Is current year leap year? " + isLeapYear);
        System.out.println("Length of the year: " + yearLength + " days");
    }
}

