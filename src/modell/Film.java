
package modell;

public class Film {

    private int gyartasi_ev;
    private String cime;
    private String rendezo;

    public void setGyartasi_ev(int gyartasi_ev) {
        this.gyartasi_ev = gyartasi_ev;
    }

    public void setCime(String cime) {
        this.cime = cime;
    }

    public void setRendezo(String rendezo) {
        this.rendezo = rendezo;
    }

    public int getGyartasi_ev() {
        return gyartasi_ev;
    }

    public String getCime() {
        return cime;
    }

    public String getRendezo() {
        return rendezo;
    }

    public Film(int gyartasi_ev, String cime, String rendezo) {
        this.gyartasi_ev = gyartasi_ev;
        this.cime = cime;
        this.rendezo = rendezo;
    }

}
