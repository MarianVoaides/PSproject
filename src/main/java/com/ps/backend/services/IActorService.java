package com.ps.backend.services;

import com.ps.backend.models.Actor;

import java.util.List;


public interface IActorService {
    public Actor findActorByActorname(String actorname);
    public Actor addActor(Actor actor);
    public Actor editActor(String actorname, int age);
    public void deleteActorByActorname(String actorname);
    public List<Actor> getAllActors();
}
