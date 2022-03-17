package com.ps.backend.repositories;

import com.ps.backend.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>
{
    @Transactional
    void deleteByMoviename(String moviename);
    Movie findByMoviename(String moviename);
}