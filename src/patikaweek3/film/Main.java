package patikaweek3.film;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Film koleksiyonu oluşturur, IMDb puanına ve yayın yılına göre sıralar, istenilen türe göre
 * filtreleme yapar.
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Film> filmList = new ArrayList<>();
        filmList.add(new Film("FilmOne", 2000, "Horror", 4.2));
        filmList.add(new Film("Film Two", 2005, "Adventure", 3.5));
        filmList.add(new Film("Film Three", 1985, "Sci-Fi", 2.7));
        filmList.add(new Film("Film Four", 2015, "Musical", 4.9));
        filmList.add(new Film("Film Five", 2025, "Survival", 1.5));
        // filmList.add(new Film("Film Six", 2025, "Survival", 1.5));

        sortBasedOnImdbRatings(filmList);
        sortBasedOnPublishYear(filmList);
        filterFilmBasedOnGenre(filmList, "Survival");
    }

    /**
     * Film koleksiyonunu IMDb puanlarına göre büyükten küçüğe sıralar.
     * @param filmList Film koleksiyonu
     */
    private static void sortBasedOnImdbRatings(ArrayList<Film> filmList)
    {
        filmList.sort(Comparator.comparingDouble(Film::getImdbRating).reversed());
        System.out.println("IMDB Puanına göre;");
        for (Film film : filmList)
        {
            System.out.println("Film adı: " + film.getFilmName() + " IMDB Puanı: " + film.getImdbRating());
        }
    }

    /**
     * Film koleksiyonunu yayın yılına göre küçükten büyüğe sıralar
     * @param filmList Film Koleksiyonu
     */
    private static void sortBasedOnPublishYear(ArrayList<Film> filmList)
    {
        filmList.sort(Comparator.comparingInt(Film::getPublicationYear));
        System.out.println("Yayın yılına göre;");
        for (Film film : filmList)
        {
            System.out.println("Film adı: " + film.getFilmName() + " Yayın yılı: " + film.getPublicationYear());
        }
    }

    /**
     * Film koleksiyonunu verilen türe göre filtreler.
     * @param filmList Film koleksiyonu
     * @param genre Filtrelenmek istenen tür
     */
    private static void filterFilmBasedOnGenre(ArrayList<Film> filmList, String genre)
    {
        System.out.println("Film Türüne Göre Filtreleme;");
        for (Film film : filmList)
        {
            if (film.getFilmGenre().equalsIgnoreCase(genre))
            {
                System.out.println("Film adı: " + film.getFilmName() + " Film Genre: " + film.getFilmGenre());
            }
        }
    }
}
