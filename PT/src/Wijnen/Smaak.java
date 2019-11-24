package Wijnen;

/**
 * PEER opdracht
 * P2W2
 */
public enum Smaak {
    BRUT, EXTRA_BRUT, BRUT_SANS_MILLESIME, SEC, DEMI_SEC, DOUX;


    @Override
    public String toString() {
        switch (this) {
            case BRUT: return "Brut";

            case EXTRA_BRUT: return "Extra-Brut";

            case BRUT_SANS_MILLESIME: return "Brut sans Millésime";

            case SEC: return "Sec";

            case DEMI_SEC: return "Demi-Sec";

            case DOUX: return "Doux";

            default: return "";
        }
    }
}
