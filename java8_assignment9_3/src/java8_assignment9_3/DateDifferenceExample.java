package java8_assignment9_3;

import java.time.LocalDate;
import java.time.Period;

public class DateDifferenceExample {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 10, 1);
        LocalDate date2 = LocalDate.of(2023, 10, 15);

        // Calculate the period between two dates
        Period period = Period.between(date1, date2);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Difference between date1 and date2:");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

        // Total number of days between two dates
        long totalDays = date1.until(date2).getDays();
        System.out.println("Total Days: " + totalDays);
    }
}
