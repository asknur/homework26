import models.Director;
import models.Film;
import util.UtilFilms;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Film[] fillms = UtilFilms.readFilms();
        for (Film fillm : fillms) {
            System.out.println(fillm.toString());
        }

        List<Film> filmList = new ArrayList<>();
        filmList.add(new Film("Good omens", 2019, "TV Series", new Director("Douglas Mackinno"), new ArrayList<>()));
        filmList.add(new Film("Carnival Row", 2019, "TV Series", new Director("Some Director"), new ArrayList<>()));
        filmList.add(new Film("Harry Potter", 2005, "Movie",  new Director("Happy Guy"), new ArrayList<>()));
        filmList.add(new Film("Hobbit: An Unexpected Journey", 2012, "Movie",  new Director("Peter Jackson"), new ArrayList<>()));
        filmList.add(new Film("The Hobbit: The Desolation of Smaug", 2013, "Movie",  new Director("Peter Jackson"), new ArrayList<>()));
        filmList.add(new Film("The Hobbit: The Battle of the Five Armies", 2014, "Movie",  new Director("Peter Jackson"), new ArrayList<>()));
        filmList.add(new Film("Avengers: Endgame", 2019, "Movie",  new Director("Anthony Russo"), new ArrayList<>()));
        filmList.add(new Film("Sherlock: Season 1", 2010, "TV Series",  new Director("Paul McGuigan"), new ArrayList<>()));

        System.out.print("Введите полное название для поиска: ");
        String userEnter = sc.nextLine();
        Film.searchByFull(userEnter, filmList);

        System.out.print("Введите часть названия для поиска: ");
        String userEnter1 = sc.nextLine();
        Film.searchByPartial(userEnter1, filmList);



        Film.sortByYear(filmList);
        Film.sortByYearReverse(filmList);
        Film.sortByName(filmList);
        Film.sortByNameReverse(filmList);
        Film.sortByDirector(filmList);
        Film.sortByDirectorReverse(filmList);

        sc.close();
    }
}