package com.ps.backend.services;

import com.ps.backend.models.Movie;
import com.ps.backend.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The type Movie service.
 */
@Service
public class MovieService implements IMovieService{

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Optional<Movie> findMovieByMoviename(int id) {
        return movieRepository.findById(id);
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie editMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void deleteMoviename(int id) {
        movieRepository.deleteById(id);
    }

    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    /**
     * Instantiates a new Movie service.
     *
     * @param movieRepository the movie repository
     */

}
