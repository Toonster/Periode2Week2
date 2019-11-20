public class Lid {

    private String naam;
    private Soort soort;
    private int lidnummer = 1000;
    private static int aantalLeden = 0;

    public static int getAantalLeden() {
        return aantalLeden;
    }

    public Lid(String naam, Soort soort) {
        this.naam = naam;
        this.soort = soort;
        if (soort.name().contentEquals("STEUNEND")) {
            lidnummer = 0;
        } else {
            aantalLeden++;
            lidnummer = lidnummer + aantalLeden;
        }
    }

    public int getLidnummer() {
        return lidnummer;
    }

    public String toString() {
        return String.format("%d %s         soort: %s\n", lidnummer, naam, soort.toString());
    }
}
