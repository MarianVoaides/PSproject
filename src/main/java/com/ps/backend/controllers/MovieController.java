package com.ps.backend.controllers;

import com.ps.backend.services.IMovieService;
import com.ps.backend.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private IMovieService movieService;
    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("")
    public Movie get(@RequestParam String moviename)
    {
        return movieService.findMovieByMoviename(moviename);
    }

    @GetMapping("/all")
    public List<Movie> getAll()
    {
        System.out.println("GET ALL");
        return movieService.getAllMovies();
    }

    @PostMapping("")
    public Movie post(@RequestBody Movie movie) {
        System.out.println("POST");
        System.out.println(movie);
        movieService.addMovie(movie);
        return movie;
    }

    @DeleteMapping("")
    public void deleteMoviename(@RequestParam String moviename) {
        System.out.println("DELETE");
        System.out.println(moviename);
        movieService.deleteMovieByMoviename(moviename);
    }

    @PutMapping("")
    public Movie put(@RequestParam String moviename, @RequestParam String director, @RequestParam String genre) {
        Movie movie = movieService.findMovieByMoviename(moviename);
        movie.setGenre(genre);
        movie.setFilmDirector(director);
        return movieService.editMovie(movie);
    }
}
