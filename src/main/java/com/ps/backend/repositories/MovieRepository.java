package com.ps.backend.repositories;

import com.ps.backend.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


/**
 * The interface Movie repository.
 */
@Repository
interface iMovieRepository extends JpaRepository<Movie, Long>
{
    /**
     * Delete by moviename.
     *
     * @param moviename the moviename
     */
    @Transactional
    void deleteByMoviename(String moviename);

    /**
     * Find by moviename movie.
     *
     * @param moviename the moviename
     * @return the movie
     */
    Movie findByMoviename(String moviename);
}