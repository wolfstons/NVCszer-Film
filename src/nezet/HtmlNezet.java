package nezet;

import java.io.FileWriter;
import java.io.IOException;
import modell.Film;
import modell.Filmek;

public class HtmlNezet {

    private final Filmek modell;

    public HtmlNezet(Filmek modell) {
        this.modell = modell;
    }

    public void megjelenit() throws IOException {

        FileWriter iro = new FileWriter("index.html");

        iro.write("<!DOCTYPE html>");
        iro.write("<html lang=\"hu\">");
        iro.write("<head>");
        iro.write("<meta charset=\"UTF-8\">");
        iro.write("<title>Filmek</title>");
        iro.write("</head>");
        iro.write("<body>");

        iro.write("<h1>Filmek</h1>");
        iro.write("<table border=\"1\">");

        iro.write("<tr>");
        iro.write("<th>Cím</th>");
        iro.write("<th>Gyártási év</th>");
        iro.write("<th>Rendező</th>");
        iro.write("</tr>");

        for (Film film : modell.getFilmek()) {
            iro.write("<tr>");
            iro.write("<td>" + film.getCime() + "</td>");
            iro.write("<td>" + film.getGyartasi_ev() + "</td>");
            iro.write("<td>" + film.getRendezo() + "</td>");
            iro.write("</tr>");
        }

        iro.write("</table>");
        iro.write("</body>");
        iro.write("</html>");

        iro.close();

        System.out.println("A HTML fájl elkészült.");
    }
}
