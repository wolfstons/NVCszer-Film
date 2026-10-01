
package app;

import java.io.FileNotFoundException;
import java.io.IOException;
import modell.Filmek;
import nezet.KonzolNezet;
import nezet.TablazatNezet;

import nezet.HtmlNezet;

public class NVCszerüFilm {

    public static void main(String[] args) throws FileNotFoundException, IOException {

    Filmek filmek = new Filmek();

    new KonzolNezet(filmek).megjelenit();
    new TablazatNezet(filmek).megjelenit();
    new HtmlNezet(filmek).megjelenit();

    }

}
