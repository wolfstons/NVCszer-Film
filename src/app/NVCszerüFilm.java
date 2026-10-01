
package app;

import modell.Filmek;
import nezet.KonzolNezet;
import nezet.TablazatNezet;

import java.util.ArrayList;
import nezet.HtmlNezet;

public class NVCszerüFilm {

    public static void main(String[] args) {
        new KonzolNezet(new Filmek()).megjelenit();
        new TablazatNezet(new Filmek()).megjelenit();
        new HtmlNezet(new Filmek()).megjelenit();
    }

}
