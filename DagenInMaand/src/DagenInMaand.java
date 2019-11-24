import java.time.LocalDate;
import java.util.Scanner;

public class DagenInMaand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isGeldig = false;
        int jaartal = 0;
        while (!isGeldig) {
            System.out.println("Geef een jaartal: ");
            if (input.hasNextInt()) {
                jaartal = input.nextInt();
                System.out.println("Jaar: " + jaartal);
                isGeldig = true;
            } else {
                System.out.println("Geen geldig jaartal!");
                input.nextLine();
                System.out.println();
            }
        }
        int dagenInMaand = 0;
        String maand = "january";
        for (LocalDate d = LocalDate.of(jaartal, 1, 1); d.isBefore(LocalDate.of(jaartal+1, 1, 2)); d = d.plusDays(1)) {
            if (!maand.equalsIgnoreCase(d.getMonth().name())) {
                System.out.printf("%-10s %d\n", maand, dagenInMaand);
                dagenInMaand = 0;
                maand = d.getMonth().name().toLowerCase();
            }
            dagenInMaand++;
        }
    }
}
