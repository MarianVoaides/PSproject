package com.ps.backend.repositories;

import com.ps.backend.models.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface ActorRepository extends JpaRepository<Actor, Long>
{
    @Transactional
    void deleteByActorname(String actorname);
    Actor findByActorname(String actorname);
}
