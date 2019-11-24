import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Artikel {
    private String naam;
    private int nummer;
    private LocalDate productieDatum;

    public Artikel(String naam, int nummer, LocalDate productieDatum) {
        this.naam = naam;
        this.nummer = nummer;
        this.productieDatum = productieDatum;
    }

    public LocalDate getProductieDatum() {
        return productieDatum;
    }

    @Override
    public String toString() {
        return String.format("%-15s %04d %s\n", naam, nummer, DateTimeFormatter.ofPattern("yyyy-MM-dd").format(productieDatum));
    }
}
