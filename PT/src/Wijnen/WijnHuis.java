package Wijnen;

/**
 * PEER opdracht
 * P2W2
 */
public class WijnHuis {
    private static final int MAX_AANTAL = 10;
    private Wijn[] wijnen = new Wijn[MAX_AANTAL];  //voorlopig gevuld met 10 null-objecten
    private String naam;
    private int aantal;

    public WijnHuis(String naam) {
        this.naam = naam;
    }

    public void voegWijnToe(Wijn wijn) {
        if (aantal < MAX_AANTAL && !zoekWijn(wijn)) {
            wijnen[aantal] = wijn;
            aantal++;
        } else {
            System.out.println("Kan de wijn niet toevoegen!");
        }
    }

    public boolean zoekWijn(Wijn wijn) {
        for (int i = 0; i<aantal; i++) {
            if (wijn.getNaam().equalsIgnoreCase(wijnen[i].getNaam())) {
                return true;
            }
        }
        return false;
    }

    public Wijn getOudsteWijn() {
        Wijn oudsteWijn;
        if (aantal == 0) {
            return null;
        } else {
            oudsteWijn = wijnen[0];
            for (Wijn wijntje : wijnen) {
                if (wijntje.getOogstDatum().getYear() < oudsteWijn.getOogstDatum().getYear()) {
                    oudsteWijn = wijntje;
                }
            }
            return oudsteWijn;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Wijnhuis %s\n", naam.toUpperCase()));

        StringBuilder wijnenTekst = new StringBuilder();
        StringBuilder champagneTekst = new StringBuilder();
        StringBuilder likeurenTekst = new StringBuilder();

        return result.toString();
    }
}
