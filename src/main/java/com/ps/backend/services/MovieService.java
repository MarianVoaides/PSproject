package com.ps.backend.services;

import com.ps.backend.models.Movie;
import com.ps.backend.repositories.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService{

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie findMovieByMoviename(String moviename) {
        return movieRepository.findByMoviename(moviename);
    }

    @Override
    public Movie addMovie(Movie client) {
        return movieRepository.save(client);
    }

    @Override
    public Movie editMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void deleteMovieByMoviename(String moviename) {
        movieRepository.deleteByMoviename(moviename);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
