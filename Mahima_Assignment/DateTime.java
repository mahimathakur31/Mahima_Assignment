package pack1;

import java.time.*;
import java.time.format.*;

public class DateTime {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        Instant currentInstant = Instant.now();

        // Define the desired formats
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd::MMM::uuuu HH::mm::ss");
        DateTimeFormatter instantFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");

        // Format and display the dates
        String formattedDate = currentDate.format(dateFormatter);
        String formattedDateTime = currentDateTime.format(dateTimeFormatter);
        String formattedInstant = instantFormatter.format(currentInstant);

        System.out.println("Default format of LocalDate = " + currentDate);
        System.out.println(formattedDate);
        System.out.println("Default format of LocalDateTime = " + currentDateTime);
        System.out.println(formattedDateTime);
        System.out.println("Default format of Instant = " + currentInstant);
        System.out.println(formattedInstant);

        // Parsing example
        String dateString = "2014-04-27T21:39:48";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString);
        System.out.println("Default format after parsing = " + parsedDateTime);
    }
}


