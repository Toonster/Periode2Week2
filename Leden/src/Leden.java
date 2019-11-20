public class Leden {

    private final int MAX_AANTAL = 100;
    private int aantal;
    private Lid[] leden = new Lid[MAX_AANTAL];

    public void voegLidToe(Lid lid) {
        if (aantal < 100) {
            leden[aantal] = lid;
            aantal++;
        } else {
            System.out.println("De lijst is vol!");
        }
    }

    public Lid getLid(int index) {
        return leden[index];
    }

    public int size() {
        boolean isRunning = true;
        int counter = 0;
        int actief = 0;
        while (isRunning) {
            if (getLid(counter) == null) {
                isRunning = false;
            } else {
                if (getLid(counter).getLidnummer() != 0) {
                    actief++;
                }
                counter++;
            }
        }
        return actief;
    }
}
