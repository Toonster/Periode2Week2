package Wijnen;

import java.time.LocalDate;

/**
 * PEER opdracht
 * P2W2
 */
public class Likeur extends Wijn {
    private double alcoholGehalte; //in procent

    public Likeur(String naam, String streek, LocalDate oogstDatum, double basisPrijs, double alcoholGehalte) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.alcoholGehalte = alcoholGehalte;
    }

    @Override
    public double berekenPrijs() {
        if (alcoholGehalte >= 0.5) {
            return getBasisPrijs() * 1.25;
        } else {
            return getBasisPrijs();
        }
    }

    @Override
    public String toString() {
        return String.format("%s --> %.0f%%\n",super.toString(),alcoholGehalte*100);
    }
}
