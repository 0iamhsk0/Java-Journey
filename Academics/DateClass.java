import java.time.*;

public class DateClass {
    static void timemethods() {
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);

        LocalTime zonedTime = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Zoned time = " + zonedTime);

        LocalTime sessionStartTime = LocalTime.of(19, 0);
        LocalTime sessionEndTime = LocalTime.parse("21:34:16.50");

        System.out.println("\nnow.isAfter(sessionStartTime) = " + sessionStartTime);
        System.out.println("\nnow.isAfter(sessionStartTime) = " + sessionEndTime);

        System.out.println("\nnow.plusHours() = " + now.plusHours(3));
        System.out.println("\nnow.plusMinutes() = " + now.plusMinutes(20));
        System.out.println("\nnow.plusSeconds() = " + now.plusSeconds(60));
        System.out.println("\nnow.plusNanos() = " + now.plusNanos(60));

        System.out.println("\nnow.minusHours() = " + now.minusHours(3));
        System.out.println("\nnow.minusMinutes() = " + now.minusMinutes(60));
        System.out.println("\nnow.minusSeconds() = " + now.minusSeconds(60));
        System.out.println("\nnow.minusNanos() = " + now.plusNanos(60));

    }

    // DATES
    // four ways to create dates
    static void dateMethods() {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);

        LocalDate zoneDate = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println("\nCurrent date in New York time: " + zoneDate);

        LocalDate holi = LocalDate.of(2024, 3, 25);
        System.out.println("Holi : " + holi);

        // to create a date:
        LocalDate newYearsDay = LocalDate.parse("2024-01-01");
        System.out.println("New Year's Day :  " + newYearsDay);

        System.out.println("is leap year? " + newYearsDay.isLeapYear());
        System.out.println("today.isAfter(holi) =  " + today.isAfter(holi));
        System.out.println("today.isBefore(holi) =  " + today.isBefore(holi));

        // adding days
        System.out.println("plusDays() = " + today.plusDays(16));
        System.out.println("minusDays()= " + today.minusDays(7));

        // adding months
        System.out.println("plusMonths() = " + today.plusMonths(2));
        System.out.println("plusYears() = " + today.plusYears(100));
        // getting the day of week
        System.out.println("dayOfWeek = " + today.getDayOfWeek().getValue());

        // getting month and year
        System.out.println("month = " + today.getMonthValue());

        Period p = Period.between(holi, newYearsDay);
        System.out.println("Period between holi and newYears day : " + p);

    }

    public static void main(String[] args) {
        dateMethods();
        timemethods();

    }
}