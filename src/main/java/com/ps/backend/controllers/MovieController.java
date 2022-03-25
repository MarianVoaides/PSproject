package com.ps.backend.controllers;

import com.ps.backend.services.IMovieService;
import com.ps.backend.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * The type Movie controller.
 */
@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private IMovieService movieService;

    /**
     * Instantiates a new Movie controller.
     *
     * @param movieService the movie service
     */
    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    /**
     * Get movie.
     *
     * @param moviename the moviename
     * @return the movie
     */
    @GetMapping("")
    public Movie get(@RequestParam String moviename)
    {
        return movieService.findMovieByMoviename(moviename);
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    @GetMapping("/all")
    public List<Movie> getAll()
    {
        return movieService.getAllMovies();
    }

    /**
     * Post movie.
     *
     * @param movie the movie
     * @return the movie
     */
    @PostMapping("")
    public Movie post(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    /**
     * Delete moviename.
     *
     * @param moviename the moviename
     */
    @DeleteMapping("")
    public void deleteMoviename(@RequestParam String moviename) {
        movieService.deleteMovieByMoviename(moviename);
    }

    /**
     * Put movie.
     *
     * @param moviename the moviename
     * @param director  the director
     * @param genre     the genre
     * @return the movie
     */
    @PutMapping("")
    public Movie put(@RequestParam String moviename, @RequestParam String director, @RequestParam String genre) {
        Movie movie = movieService.findMovieByMoviename(moviename);
        movie.setGenre(genre);
        movie.setFilmDirector(director);
        return movieService.editMovie(movie);
    }
}
