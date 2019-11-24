public class Artikels {
    private final int AANTAL_ARTIKELS = 6;
    private Artikel[] artikels = new Artikel[AANTAL_ARTIKELS];

    public Artikels(Artikel[] artikels) {
        for (int i = 0; i < AANTAL_ARTIKELS; i++) {
            this.artikels[i] = artikels[i];
        }
    }

    public Artikel[] getArtikels() {
        return artikels;
    }
}
