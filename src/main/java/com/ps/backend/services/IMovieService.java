package com.ps.backend.services;

import com.ps.backend.models.Movie;

import java.util.List;


public interface IMovieService {
    public Movie findMovieByMoviename(String moviename);
    public Movie addMovie(Movie movie);
    public Movie editMovie(Movie movie);
    public void deleteMovieByMoviename(String moviename);
    public List<Movie> getAllMovies();
}
