package com.ps.backend.controllers;

import com.ps.backend.services.IActorService;
import com.ps.backend.models.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private IActorService actorService;
    public ActorController(IActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("")
    public Actor get(@RequestParam String actorname)
    {
        return actorService.findActorByActorname(actorname);
    }

    @GetMapping("/all")
    public List<Actor> getAll()
    {
        return actorService.getAllActors();
    }

    @PostMapping("")
    public Actor post(@RequestBody Actor actor) {
        actorService.addActor(actor);
        return actor;
    }

    @DeleteMapping("")
    public void deleteActorname(@RequestParam String actorname) {
        actorService.deleteActorByActorname(actorname);
    }

    @PutMapping("")
    public Actor put(@RequestParam String actorname, int age) {
        return actorService.editActor(actorname, age);
    }
}
