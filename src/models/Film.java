package models;

import java.util.*;

public class Film implements Comparable<Film> {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public Film(String name, int year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Название: %s\n", getName()));
        sb.append(String.format("Год выпуска: %d\n", getYear()));
        sb.append(String.format("Тип: %s\n", getDescription()));
        sb.append(String.format("Режиссер: %s\n", getDirector()));
        sb.append(String.format("В ролях: %s\n", getCast()));
        sb.append("---------------------------------------\n");
        return sb.toString();
    }

    public static void searchByFull(String userEnter, List<Film> films) {
        boolean state = false;
        for (Film film : films) {
            if (film.getName().equalsIgnoreCase(userEnter)) {
                System.out.println("Полное совпадение: " + film);
                state = true;
            }
        }
        if (!state) {
            System.out.println("Совпадение не найдено");
        }
    }

    public static void searchByPartial(String userEnter, List<Film> films) {
        boolean state = false;
        for (Film film : films) {
            if (film.getName().toLowerCase().contains(userEnter.toLowerCase())) {
                System.out.println("Частичное совпадение: " + film);
                state = true;
            }
        }
        if (!state) {
            System.out.println("Совпадение не найдено");
        }
    }

    @Override
    public int compareTo(Film o) {
        return Integer.compare(this.getYear(), o.getYear());
    }

    public static void sortByYear(List<Film> films) {
        System.out.println("Сортировка по году выпуска по возвростанию:");
        films.sort(Comparator.comparing(Film :: getYear));
        films.forEach(System.out :: println);
    }

    public static void sortByYearReverse(List<Film> films) {
        System.out.println("Сортировка по году выпуска по возвростанию:");
        films.sort(Comparator.comparing(Film :: getYear).reversed());
        films.forEach(System.out :: println);
    }

    public static void sortByName(List<Film> films) {
        System.out.println("Сортировка по имени по алфавитному порядку:");
        films.sort(Comparator.comparing(Film :: getName));
        films.forEach(System.out :: println);
    }

    public static void sortByNameReverse(List<Film> films) {
        System.out.println("ССортировка по имени по обратному алфавитному порядку:");
        films.sort(Comparator.comparing(Film :: getName).reversed());
        films.forEach(System.out :: println);
    }

    public static void sortByDirector(List<Film> films) {
        System.out.println("Сортировка по имени по режиссеру A - Z:");
        films.sort(Comparator.comparing((Film f) -> f.getDirector().getFullname()));
        films.forEach(System.out :: println);
    }

    public static void sortByDirectorReverse(List<Film> films) {
        System.out.println("Сортировка по имени по режиссеру Z - A:");
        films.sort(Comparator.comparing((Film f) -> f.getDirector().getFullname()).reversed());
        films.forEach(System.out :: println);
    }

}
