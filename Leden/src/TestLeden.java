public class TestLeden {
    public static void main(String[] args) {
        Leden leden = new Leden();
        leden.voegLidToe(new Lid("Jos", Soort.GEWOON));
        leden.voegLidToe(new Lid("Bart", Soort.ERELID));
        leden.voegLidToe(new Lid("Helmut", Soort.STEUNEND));
        leden.voegLidToe(new Lid("Marie", Soort.GEWOON));
        leden.voegLidToe(new Lid("Emma", Soort.GEWOON));
        leden.voegLidToe(new Lid("Hagar", Soort.ERELID));

        System.out.println("Aantal actieve leden: " + leden.size());
        for (int i = 0; i <= leden.size(); i++) {
            if (leden.getLid(i).getLidnummer() != 0) {
                System.out.println(leden.getLid(i).toString());
            }
        }
    }
}
