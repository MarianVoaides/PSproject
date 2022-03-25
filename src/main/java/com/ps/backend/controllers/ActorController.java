package com.ps.backend.controllers;

import com.ps.backend.services.IActorService;
import com.ps.backend.models.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * The type Actor controller.
 */
@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private IActorService actorService;

    /**
     * Instantiates a new Actor controller.
     *
     * @param actorService the actor service
     */
    public ActorController(IActorService actorService) {
        this.actorService = actorService;
    }

    /**
     * Get actor.
     *
     * @param actorname the actorname
     * @return the actor
     */
    @GetMapping("")
    public Actor get(@RequestParam String actorname)
    {
        return actorService.findActorByActorname(actorname);
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    @GetMapping("/all")
    public List<Actor> getAll()
    {
        return actorService.getAllActors();
    }

    /**
     * Post actor.
     *
     * @param actor the actor
     * @return the actor
     */
    @PostMapping("")
    public Actor post(@RequestBody Actor actor) {
        actorService.addActor(actor);
        return actor;
    }

    /**
     * Delete actorname.
     *
     * @param actorname the actorname
     */
    @DeleteMapping("")
    public void deleteActorname(@RequestParam String actorname) {
        actorService.deleteActorByActorname(actorname);
    }

    /**
     * Put actor.
     *
     * @param actorname the actorname
     * @param age       the age
     * @return the actor
     */
    @PutMapping("")
    public Actor put(@RequestParam String actorname, int age) {
        return actorService.editActor(actorname, age);
    }
}
