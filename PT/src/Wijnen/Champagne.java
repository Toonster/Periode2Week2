package Wijnen;

import java.time.LocalDate;

/**
 * PEER opdracht
 * P2W2
 */
public class Champagne extends Wijn {
    private Smaak smaak;

    public Champagne(String naam, String streek, LocalDate oogstDatum, double basisPrijs, Smaak smaak) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.smaak = smaak;
    }

    @Override
    public double berekenPrijs() {
        if (smaak.toString().toLowerCase().contains("brut")) {
            return getBasisPrijs() * 1.1;
        } else {
            return getBasisPrijs();
        }
    }

    @Override
    public String toString() {
        return String.format("%s --> Type: %s\n", super.toString(), smaak.toString());
    }
}
