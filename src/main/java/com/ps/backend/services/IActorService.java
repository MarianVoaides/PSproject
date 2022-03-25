package com.ps.backend.services;

import com.ps.backend.models.Actor;

import java.util.List;


/**
 * The interface Actor service.
 */
public interface IActorService {
    /**
     * Find actor by actorname actor.
     *
     * @param actorname the actorname
     * @return the actor
     */
    Actor findActorByActorname(String actorname);

    /**
     * Add actor actor.
     *
     * @param actor the actor
     * @return the actor
     */
    Actor addActor(Actor actor);

    /**
     * Edit actor actor.
     *
     * @param actorname the actorname
     * @param age       the age
     * @return the actor
     */
    Actor editActor(String actorname, int age);

    /**
     * Delete actor by actorname.
     *
     * @param actorname the actorname
     */
    void deleteActorByActorname(String actorname);

    /**
     * Gets all actors.
     *
     * @return the all actors
     */
    List<Actor> getAllActors();
}
