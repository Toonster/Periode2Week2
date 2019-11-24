import java.time.LocalDate;

public class Wapenstilstand {
    public static void main(String[] args) {
        LocalDate wapenstilstand = LocalDate.of(1918, 11, 11);
        System.out.printf("Wapenstilstand was op een %s\n", wapenstilstand.getDayOfWeek().name().toLowerCase());
        int teller = 0;
        for (LocalDate d = LocalDate.of(1980, 11, 11); d.isBefore(LocalDate.of(2040, 11, 12)); d = d.plusYears(1)) {
            if (d.getDayOfWeek().name().equalsIgnoreCase("sunday")) {
                System.out.printf("%d ", d.getYear());
                teller++;
                if (teller % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
