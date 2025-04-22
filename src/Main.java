import models.Director;
import models.Film;
import util.UtilFilms;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Film[] films = UtilFilms.readFilms();
        for (Film film : films) {
            System.out.println(film.toString());
        }



        List<Film> films1 = new ArrayList<>();
        films1.add(new Film("The Hobbit", 2012, "TV Series", new Director("Peter Jackson"), new ArrayList<>()));
        films1.add(new Film("Avengers: Endgame", 2019, "Movie", new Director("Peter Jackson"), new ArrayList<>()));

        System.out.print("Введите полное название для поиска: ");
        String userEnter = sc.nextLine();
        Film.searchByFull(userEnter, films1);

        System.out.print("Введите часть названия для поиска: ");
        String userEnter1 = sc.nextLine();
        Film.searchByPartial(userEnter1, films1);

        Film.sortYear(films1);

        sc.close();
    }
}