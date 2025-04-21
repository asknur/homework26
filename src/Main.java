import com.google.gson.JsonObject;
import models.Film;
import util.UtilFilms;

public class Main {
    public static void main(String[] args) {
        Film[] films = UtilFilms.readFilms();
        for (Film film : films) {
            System.out.println("Название: " + film.getName());
            System.out.println("Год выпуска: " + film.getYear());
            System.out.println("Тип: " + film.getDescription());
            System.out.println("Режиссер: " + film.getDirector());
            System.out.println("Актеры:" + film.getCast());
            System.out.println("----------------------");
        }
    }
}