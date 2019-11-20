package FilmPack;

public class Film {

    private String titel;
    private int jaar;
    private Drager drager;
    private Geluid geluid;

    public Film(String titel, int jaar, Drager drager, Geluid geluid) {
        this.titel = titel;
        this.jaar = jaar;
        this.drager = drager;
        this.geluid = geluid;
    }

    public String toString() {
        return String.format("%-20s  %d %-8s %s\n", titel, jaar, drager.toString(), geluid.toString());
    }
}
