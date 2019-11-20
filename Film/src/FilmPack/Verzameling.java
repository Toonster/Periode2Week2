package FilmPack;

import static FilmPack.Drager.*;
import static FilmPack.Geluid.*;

public class Verzameling {

    Film[] verzameling = new Film[2000];
    private int aantal = 0;

    public Verzameling() {
        vulTabel();
    }

    public int getAantal() {
        return aantal;
    }

    public Film[] getVerzameling() {
        return verzameling;
    }

    public void vulTabel() {
        voegFilmToe("Ronin", 1998, DVD, Geluid.DOLBY);
        voegFilmToe("Lakeview Terrace", 2008, Drager.BLU_RAY, Geluid.DOLBY_HD);
        voegFilmToe("Ghost Town", 2008, Drager.DVD, Geluid.DOLBY);
        voegFilmToe("Stealth", 2005, Drager.BLU_RAY, Geluid.PCM);
        voegFilmToe("Fast & Furious 6", 2013, Drager.BLU_RAY, Geluid.DTS_HD);
        voegFilmToe("Twilight", 2008, Drager.DVD, Geluid.DOLBY);
        voegFilmToe("The Brave One", 2007, Drager.BLU_RAY, Geluid.DTS);
    }

    private void voegFilmToe(String titel, int jaar,
                             Drager drager, Geluid geluid) {
        verzameling[aantal++] = new Film(titel, jaar, drager, geluid);
    }
}
