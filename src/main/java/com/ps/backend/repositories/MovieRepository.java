package com.ps.backend.repositories;
import com.ps.backend.models.Actor;
import com.ps.backend.models.Choregrapher;
import com.ps.backend.models.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * /**
 *  * This will be AUTO IMPLEMENTED by Spring into a Bean called MovieRepository
 *  * CRUD refers Create, Read, Update, Delete
 *  * This class is responsable for communication with the table in Database
 */
@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
