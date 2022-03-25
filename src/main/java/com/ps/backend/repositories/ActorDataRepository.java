package com.ps.backend.repositories;

import com.ps.backend.models.Actor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

/**
 * The type Actor data repository.
 */
public class ActorDataRepository
{
    /**
     * The Actors.
     */
    public List<Actor> actors;

    /**
     * Instantiates a new Actor data repository.
     */
    public ActorDataRepository() {
        actors = new ArrayList<Actor>();
    }

    /**
     * Find by id actor.
     *
     * @param id the id
     * @return the actor
     */
    public Actor findById(Long id)
    {
        for(Actor i : actors)
        {
            if(i.getId() == id)
                return i;
        }
        return null;
    }

    /**
     * Find all list.
     *
     * @return the list
     */
    public List<Actor> findAll()
    {
        return actors;
    }

    /**
     * Save actor.
     *
     * @param actor the actor
     * @return the actor
     */
    public Actor save(Actor actor)
    {
        Random rand = new Random();
        actor.setId(abs(rand.nextLong()));
        actors.add(actor);
        return actor;
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    public void delete(Long id)
    {
        Actor actor = new Actor();
        for(Actor i : actors)
        {
            if(i.getId() == id)
                actor = i;
        }
        actors.remove(actor);
    }

}
