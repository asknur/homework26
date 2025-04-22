package util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import models.Film;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UtilFilms {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("src/json/movies.json");

private static class FilmCover {
    private Film[] movies;

    public Film[] getMovies() {
        return movies;
    }
}

public static Film[] readFilms() {
    try {
        String json = Files.readString(PATH);
        FilmCover filmCover = GSON.fromJson(json, FilmCover.class);
        return filmCover.getMovies();
    } catch (IOException e) {
        e.printStackTrace();
        return new Film[0];
    }
}

public static void writeFilms(Film[] films) {
    FilmCover filmCover = new FilmCover();
    filmCover.movies = films;
    String json = GSON.toJson(filmCover);
    try {
        Files.writeString(PATH, json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
