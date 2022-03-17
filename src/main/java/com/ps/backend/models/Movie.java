package com.ps.backend.models;
import javax.persistence.*;

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

    public Movie(String moviename, String genre, String filmDirector) {
        super();
        this.moviename = moviename;
        this.genre = genre;
        this.filmDirector = filmDirector;
    }

    public Movie() {
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String movieTitle) {
        this.moviename = movieTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFilmDirector() {
        return filmDirector;
    }

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
