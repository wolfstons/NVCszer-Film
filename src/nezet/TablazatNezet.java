package nezet;

import modell.Film;
import modell.Filmek;

public class TablazatNezet {

    private Filmek modell;

    public TablazatNezet(Filmek modell) {
        this.modell = modell;
    }

    public void megjelenit() {
        System.out.println("FILMEK");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-25s %-15s %-25s%n", "Cím", "Gyártási év", "Rendező");
        System.out.println("------------------------------------------------------------");
        for (Film film : modell.getFilmek()) {
            System.out.printf("%-25s %-15d %-25s%n", film.getCime(), film.getGyartasi_ev(), film.getRendezo());
        }
        System.out.println("------------------------------------------------------------");
    }
}
