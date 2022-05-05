package com.ps.backend.services;

import com.ps.backend.models.Movie;

import java.util.List;
import java.util.Optional;


/**
 * The interface Movie service.
 */
public interface IMovieService {
    /**
     * Find movie by moviename movie.
     *
     * @param id the int
     * @return the movie
     */
    public Optional<Movie> findMovieByMoviename(int id);

    /**
     * Add movie movie.
     *
     * @param movie the movie
     * @return the movie
     */
    public Movie addMovie(Movie movie);

    /**
     * Edit movie movie.
     *
     * @param movie the movie
     * @return the movie
     */
    public Movie editMovie(Movie movie);

    /**
     * Delete movie by id.
     *
     * @param id the int
     */
    public void deleteMoviename(int id);

    /**
     * Gets all movies.
     *
     * @return the all movies
     */
    public List<Movie> getAllMovies();
}
