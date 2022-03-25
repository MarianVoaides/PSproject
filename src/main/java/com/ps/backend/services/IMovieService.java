package com.ps.backend.services;

import com.ps.backend.models.Movie;

import java.util.List;


/**
 * The interface Movie service.
 */
public interface IMovieService {
    /**
     * Find movie by moviename movie.
     *
     * @param moviename the moviename
     * @return the movie
     */
    public Movie findMovieByMoviename(String moviename);

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
     * Delete movie by moviename.
     *
     * @param moviename the moviename
     */
    public void deleteMovieByMoviename(String moviename);

    /**
     * Gets all movies.
     *
     * @return the all movies
     */
    public List<Movie> getAllMovies();
}
