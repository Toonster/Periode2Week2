import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class VrijdagDe13e {
    public static void main(String[] args) {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("MMM yyyy");
        for (LocalDate d = LocalDate.of(2010, 1, 13); d.isBefore(LocalDate.of(2019, 12, 31)); d = d.plusMonths(1)) {
            if (d.getDayOfWeek().name().equalsIgnoreCase("friday")) {
                System.out.printf("%s\n", myFormat.format(d).toLowerCase());
            }
        }
    }
}
