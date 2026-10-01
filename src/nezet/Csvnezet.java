package nezet;

import java.io.FileWriter;
import java.io.IOException;
import modell.Film;
import modell.Filmek;

public class Csvnezet {

    private final Filmek modell;

    public Csvnezet(Filmek modell) {
        this.modell = modell;
    }

    public void megjelenit() throws IOException {

        FileWriter iro = new FileWriter("adat.csv");

        // Fejléc
        iro.write("Cím;Gyártási év;Rendező\n");

        // Filmek kiírása
        for (Film film : modell.getFilmek()) {
            iro.write(film.getCime() + ";");
            iro.write(film.getGyartasi_ev() + ";");
            iro.write(film.getRendezo() + "\n");
        }

        iro.close();

        System.out.println("A CSV fájl elkészült.");
    }
}