package nezet;

import java.io.PrintWriter;
import modell.Film;
import modell.Filmek;

public class HtmlNezet {

    private Filmek modell;

    public HtmlNezet(Filmek modell) {
        this.modell = modell;
    }

    public void megjelenit() {
       

    try {
        PrintWriter iro = new PrintWriter("filmek.html");

        iro.println("<!DOCTYPE html>");
        iro.println("<html lang=\"hu\">");
        iro.println("<head>");
        iro.println("<meta charset=\"UTF-8\">");
        iro.println("<title>Filmek</title>");
        iro.println("</head>");
        iro.println("<body>");

        iro.println("<h1>Filmek</h1>");
        iro.println("<table border=\"1\">");

        iro.println("<tr>");
        iro.println("<th>Cím</th>");
        iro.println("<th>Gyártási év</th>");
        iro.println("<th>Rendező</th>");
        iro.println("</tr>");

        for (Film film : modell.getFilmek()) {
            iro.println("<tr>");
            iro.println("<td>" + film.getCime() + "</td>");
            iro.println("<td>" + film.getGyartasi_ev() + "</td>");
            iro.println("<td>" + film.getRendezo() + "</td>");
            iro.println("</tr>");
        }

        iro.println("</table>");
        iro.println("</body>");
        iro.println("</html>");

        iro.close();

        System.out.println("A HTML fájl elkészült.");

    } catch (Exception e) {
        System.out.println("Hiba a fájl írásakor: " + e.getMessage());
    }

    }
}
