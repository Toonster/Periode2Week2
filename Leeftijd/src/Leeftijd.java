import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Leeftijd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef je geboortejaar: ");
        int jaar = input.nextInt();
        System.out.println("Geef je geboortemaand: ");
        int maand = input.nextInt();
        System.out.println("Geef je geboortedag: ");
        int dag = input.nextInt();
        LocalDate geboorteDatum = LocalDate.of(jaar, maand, dag);
        LocalDate d = LocalDate.now();
        Period leeftijd = Period.between(geboorteDatum, d);
        System.out.printf("Je bent nu %d jaren %d maanden en %d dagen oud\n", leeftijd.getYears(), leeftijd.getMonths(), leeftijd.getDays());
        System.out.printf("Je bent geboren op een %s\n", geboorteDatum.getDayOfWeek().name().toLowerCase());


        System.out.println("Geef je geboortedatum in de vorm dd/mm/jjjj: ");
        String date = input.nextLine();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate geboorteDatum2 = LocalDate.parse(date, myFormat);
        Period leeftijd2 = Period.between(geboorteDatum2, d);
        System.out.printf("Je bent nu %d jaren %d maanden en %d dagen oud\n", leeftijd2.getYears(), leeftijd2.getMonths(), leeftijd2.getDays());
        System.out.printf("Je bent geboren op een %s\n", geboorteDatum2.getDayOfWeek().name().toLowerCase());
    }
}
