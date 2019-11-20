package FilmPack;

public enum Geluid {
    PCM, DOLBY, DOLBY_HD, DTS, DTS_HD;

    public String toString() {
        if (name().contentEquals("PCM")) {
            return name();
        } else if (name().contentEquals("DOLBY")) {
            return "Dolby";
        } else if (name().contentEquals("DOLBY_HD")) {
            return "Dolby HD";
        } else if (name().contentEquals("DTS")) {
            return name();
        } else if (name().contentEquals("DTS_HD")) {
            return "DTS HD";
        } else {
            return name();
        }
    }
}
