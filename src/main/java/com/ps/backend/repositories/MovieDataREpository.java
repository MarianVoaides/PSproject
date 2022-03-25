package com.ps.backend.repositories;

import com.ps.backend.models.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

/**
 * The type Movie data repository.
 */
public class MovieDataRepository
{
    /**
     * The Movies.
     */
    public List<Movie> movies;

    /**
     * Instantiates a new Movie data repository.
     */
    public MovieDataRepository() {
        movies = new ArrayList<Movie>();
    }

    /**
     * Find by id movie.
     *
     * @param id the id
     * @return the movie
     */
    public Movie findById(Long id)
    {
        for(Movie i : movies)
        {
            if(i.getId() == id)
                return i;
        }
        return null;
    }

    /**
     * Find all list.
     *
     * @return the list
     */
    public List<Movie> findAll()
    {
        return movies;
    }

    /**
     * Save movie.
     *
     * @param movie the movie
     * @return the movie
     */
    public Movie save(Movie movie)
    {
        Random rand = new Random();
        movie.setId(abs(rand.nextLong()));
        movies.add(movie);
        return movie;
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(Long id)
    {
        Movie movie = new Movie();
        for(Movie i : movies)
        {
            if(i.getId() == id)
                movie = i;
        }
        movies.remove(movie);
    }

}
