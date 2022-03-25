package com.ps.backend.models;
import javax.persistence.*;

/**
 * The type Movie.
 */
@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 1L;
    @Column(name = "title", unique = true, nullable = false)
    private String moviename;
    @Column(name = "genre", nullable = false)
    private String genre;
    @Column(name = "film_director", nullable = false)
    private String filmDirector;

    /**
     * Instantiates a new Movie.
     *
     * @param moviename    the moviename
     * @param genre        the genre
     * @param filmDirector the film director
     */
    public Movie(String moviename, String genre, String filmDirector) {
        super();
        this.moviename = moviename;
        this.genre = genre;
        this.filmDirector = filmDirector;
    }

    /**
     * Instantiates a new Movie.
     */
    public Movie() {
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets moviename.
     *
     * @return the moviename
     */
    public String getMoviename() {
        return moviename;
    }

    /**
     * Sets moviename.
     *
     * @param movieTitle the movie title
     */
    public void setMoviename(String movieTitle) {
        this.moviename = movieTitle;
    }

    /**
     * Gets genre.
     *
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets genre.
     *
     * @param genre the genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gets film director.
     *
     * @return the film director
     */
    public String getFilmDirector() {
        return filmDirector;
    }

    /**
     * Sets film director.
     *
     * @param filmDirector the film director
     */
    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieTitle='" + moviename + '\'' +
                ", genre='" + genre + '\'' +
                ", filmDirector='" + filmDirector + '\'' +
                '}';
    }
}
