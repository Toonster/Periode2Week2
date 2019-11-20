package FilmPack;

public enum Drager {
    BLU_RAY, DVD;

    public String toString() {
        if (name().contentEquals("BLU_RAY")) {
            return "BluRay";
        } else {
            return name();
        }
    }
}
