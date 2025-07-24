package patikaweek3.film;

/**
 * Film sınıfı, filmin adını, yayın yılını, türünü ve IMDb puanını tutar.
 */
public class Film
{
    private String filmName;
    private int publicationYear;
    private String filmGenre;
    private double imdbRating;

    /**
     * Film sınıfına ait yapıcı metottur
     *
     * @param filmName
     * @param publicationYear
     * @param filmGenre
     * @param imdbRating
     */
    public Film(String filmName, int publicationYear, String filmGenre, double imdbRating)
    {
        this.filmName = filmName;
        this.publicationYear = publicationYear;
        this.filmGenre = filmGenre;
        this.imdbRating = imdbRating;
    }

    /**
     * @return Filmin adı
     */
    public String getFilmName()
    {
        return filmName;
    }

    /**
     * @return Filmin yayın yılı
     */
    public int getPublicationYear()
    {
        return publicationYear;
    }

    /**
     * @return Filmin IMDb puanı
     */
    public double getImdbRating()
    {
        return imdbRating;
    }

    /**
     * @return Filmin türü
     */
    public String getFilmGenre()
    {
        return filmGenre;
    }
}
