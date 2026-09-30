
package app;


public class KonzolNezet {
    private Filmek modell;

    public KonzolNezet(Filmek modell) {
        this.modell = modell;
    }
    public void megjelenit(){
        for (Film Film : modell.getFilmek()) {
            System.out.println("Cím: " + Film.getCime());
            System.out.println("Gyártási év: " + Film.getGyartasi_ev());
            System.out.println("Rendező: " + Film.getRendezo());
        }
    }
}
