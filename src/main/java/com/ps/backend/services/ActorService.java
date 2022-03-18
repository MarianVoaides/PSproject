package com.ps.backend.services;

import com.ps.backend.models.Actor;
import com.ps.backend.repositories.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService implements IActorService
{
    private ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public Actor findActorByActorname(String actorname) {
        return actorRepository.findByActorname(actorname);
    }

    @Override
    public Actor addActor(Actor client) {
        return actorRepository.save(client);
    }

    @Override
    public Actor editActor(String actorname, int age) {
        Actor actor = findActorByActorname(actorname);
        actor.setAge(age);
        return actorRepository.save(actor);
    }

    @Override
    public void deleteActorByActorname(String actorname) {
        actorRepository.deleteByActorname(actorname);
    }

    @Override
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }
}
