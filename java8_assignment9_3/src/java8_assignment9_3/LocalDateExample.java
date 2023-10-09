package java8_assignment9_3;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        // Creating a LocalDate for a specific date
        LocalDate date1 = LocalDate.of(2023, 10, 1);
        System.out.println("Date 1: " + date1);

        // Getting the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Parsing a date from a string
        LocalDate dateFromString = LocalDate.parse("2023-10-15");
        System.out.println("Date from String: " + dateFromString);

        // Adding and subtracting days
        LocalDate futureDate = currentDate.plusDays(7);
        LocalDate pastDate = currentDate.minusDays(3);
        System.out.println("Future Date: " + futureDate);
        System.out.println("Past Date: " + pastDate);
    }
}

