package com.ps.backend.controllers;

import com.ps.backend.services.IMovieService;
import com.ps.backend.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


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
     * @param id the int
     * @return the movie
     */
    @GetMapping("")
    public Movie get(@RequestParam int id)
    {
        Optional<Movie> movie = movieService.findMovieByMoviename(id);
        if(movie.isPresent()){
            Movie m1 = movie.get();
            return m1;
        }
        return null;
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
     * @param id the int
     */
    @DeleteMapping("")
    public void deleteMoviename(@RequestParam int id) {
        movieService.deleteMoviename(id);
    }

    /**
     * Put movie.
     *
     * @param id the int
     * @param director  the director
     * @param genre     the genre
     * @return the movie
     */
    @PutMapping("")
    public Movie put(@RequestParam int id, @RequestParam String director, @RequestParam String genre) {
        Optional<Movie> movie = movieService.findMovieByMoviename(id);
        if(movie.isPresent()){
            Movie m1 = movie.get();
            m1.setGenre(genre);
            m1.setFilmDirector(director);
            return movieService.editMovie(m1);
        }
        return null;
    }
}
