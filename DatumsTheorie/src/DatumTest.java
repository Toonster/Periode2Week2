 import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DatumTest {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        System.out.printf("Het is vandaag %s%n\n", formatter.format(d));
        int periode = 1000;
        LocalDateTime p = LocalDateTime.now().plusDays(periode);
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.printf("Binnen %d dagen is het %s%n\n", periode, myFormat.format(p));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("De schrikkeljaren tussen 1995 en 2020 zijn: ");
        for (LocalDate date = LocalDate.of(1995, 1, 1); date.isBefore(LocalDate.of(2020, 1, 2)); date = date.plusYears(1)) {
            if (date.isLeapYear()) {
                System.out.print(format.format(date) + " ");
            }
        }
        Duration duration = Duration.between(LocalDateTime.of(2001,1,1,0,0,0), LocalDateTime.now());
        System.out.printf("Hoeveel seconden duurt dit millennium al?: %d\n",duration.getSeconds());
        long durationMonths = ChronoUnit.MONTHS.between(LocalDateTime.of(2000,1,1,0,0,0), LocalDateTime.now());
        System.out.printf("In maanden is dit: %d\n", durationMonths);
    }

}

