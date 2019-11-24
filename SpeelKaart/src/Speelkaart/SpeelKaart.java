package Speelkaart;

import java.util.Random;

public class SpeelKaart {

    private static final Random random = new Random();
    private KaartKleur kleur;
    private KaartWaarde waarde;

    public SpeelKaart(KaartKleur kleur, KaartWaarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public enum KaartKleur {
        HARTEN, SCHOPPEN, RUITEN, KLAVEREN;

        public String toString() {
            return name().toLowerCase();
        }
    }

    public enum KaartWaarde {
        TWEE(2), DRIE(3), VIER(4), VIJF(5), ZES(6), ZEVEN(7), ACHT(8), NEGEN(9), TIEN(10), BOER(10), DAME(10), HEER(10), AAS(1);

        private int waarde;

        KaartWaarde(int waarde) {
            this.waarde = waarde;
        }

        public String toString() {
            return name().toLowerCase();
        }

        public int getKaartWaarde() {
            return waarde;
        }
    }

    public KaartKleur getKleur() {
        return kleur;
    }

    public KaartWaarde getWaarde() {
        return waarde;
    }

    public int getGetalWaarde() {
        return waarde.getKaartWaarde();
    }

    public void setKaart(KaartKleur kleur, KaartWaarde waarde) {
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public void maakWillekeurigeKaart() {
        KaartKleur[] kleuren = KaartKleur.values();
        kleur = kleuren[random.nextInt(kleuren.length)];
        KaartWaarde[] waardes = KaartWaarde.values();
        waarde = waardes[random.nextInt(waardes.length)];
    }

    public String toString() {
        return kleur.toString() + " " + waarde.toString();
    }

    public String toonWaarde() {
        switch (waarde) {
            case AAS:
            case DAME:
            case HEER:
            case BOER: return toString();
            default: return String.format("%s %d\n", kleur.toString(),getGetalWaarde());
        }
    }
}
