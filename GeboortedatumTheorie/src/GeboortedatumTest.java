import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GeboortedatumTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int currentYear = 2019;
        System.out.println("Geef je geboortejaar: ");
        int jaar = input.nextInt();
        System.out.println("Geef je geboortemaand: ");
        int maand = input.nextInt();
        System.out.println("Geef je geboortedag: ");
        int dag = input.nextInt();
        LocalDate date = LocalDate.of(jaar, maand, dag);
        Period leeftijd = Period.between(date, LocalDate.now());
        System.out.printf("Je leeftijd is %d jaar, %d maand(en) en %d dag(en)\n", leeftijd.getYears(), leeftijd.getMonths(), leeftijd.getDays());
        LocalDate nu = LocalDate.now();
        LocalDate verjaardag = LocalDate.of(nu.getYear(),maand,dag);
        if (verjaardag.isBefore(nu) || verjaardag.isEqual(nu)) {
            verjaardag = verjaardag.plusYears(1);
        }
        System.out.printf("Je volgende verjaardag is binnen %d dagen\n", ChronoUnit.DAYS.between(nu, verjaardag));
    }
}
