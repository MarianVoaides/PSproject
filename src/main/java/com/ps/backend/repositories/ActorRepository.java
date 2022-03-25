package com.ps.backend.repositories;

import com.ps.backend.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


/**
 * The interface Actor repository.
 */
@Repository
public interface ActorRepository extends JpaRepository<Actor, Long>
{
    /**
     * Delete by actorname.
     *
     * @param actorname the actorname
     */
    @Transactional
    void deleteByActorname(String actorname);

    /**
     * Find by actorname actor.
     *
     * @param actorname the actorname
     * @return the actor
     */
    Actor findByActorname(String actorname);
}
