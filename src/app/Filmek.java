package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filmek {

    private ArrayList<Film> filmek = new ArrayList<>();

    Film film1 = new Film(1994, "A remény rabjai", "Frank Darabont");
    Film film2 = new Film(1972, "A keresztapa", "Francis Ford Coppola");
    Film film3 = new Film(1997, "Titanic", "James Cameron");
    Film film4 = new Film(2000, "Gladiátor", "Ridley Scott");
    Film film5 = new Film(2010, "Eredet", "Christopher Nolan");

    Film[] filmTomb = {film1, film2, film3, film4, film5};

    public Filmek() {
        for (Film film : filmTomb) {
            filmek.add(film);
        }
    }

    public ArrayList<Film> getFilmek() {
        ArrayList<Film> masolat = new ArrayList<>(filmek);
        return masolat;
    }

    public void felvesz(Film film) {
        filmek.add(film);
    }

    public List<Film> getFilMek() {
        ArrayList<Film> masolat = new ArrayList<>(filmek);
        Collections.sort(masolat);
        return masolat;
    }
}
