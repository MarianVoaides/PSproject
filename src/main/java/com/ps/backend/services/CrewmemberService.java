package com.ps.backend.services;

import com.ps.backend.models.*;
import com.ps.backend.repositories.ActorRepository;
import com.ps.backend.repositories.CameramanRepository;
import com.ps.backend.repositories.ChoregrapherRepository;
import com.ps.backend.repositories.CrewmemberRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * This class implement the logic for operation on crewmember table from database
 */
@Service
public class CrewmemberService implements ICrewmemberService {

    CameramanRepository cameramanRepository;
    ChoregrapherRepository choregrapherRepositoryy;
    ActorRepository actorCrewmemberRepository;


    @Override
    public List<Crewmember> getCrewmembers(CrewEnum tip) {
        List<Crewmember> crewmembers = new ArrayList<>();
        if(tip==CrewEnum.Actor){
            List<Actor> premiumCrewmembers = new ArrayList<>();
            actorCrewmemberRepository.findAll().forEach(premiumCrewmembers::add);
            for(Actor p: premiumCrewmembers){
                crewmembers.add(p);
            }
            return crewmembers;
        }else if(tip==CrewEnum.Cameraman){
            List<Cameraman> premiumCrewmembers = new ArrayList<>();
            cameramanRepository.findAll().forEach(premiumCrewmembers::add);
            for(Cameraman p: premiumCrewmembers){
                crewmembers.add(p);
            }
            return crewmembers;
        }else if(tip==CrewEnum.Choregrapher){
            List<Choregrapher> premiumCrewmembers = new ArrayList<>();
            choregrapherRepositoryy.findAll().forEach(premiumCrewmembers::add);
            for(Choregrapher p: premiumCrewmembers){
                crewmembers.add(p);
            }
            return crewmembers;
        }else{
            return null;
        }
    }

    @Override
    public Crewmember getCrewmemberByID(int id) {
        if(actorCrewmemberRepository.findById(id).get() != null){
            return actorCrewmemberRepository.findById(id).get();
        }
        if(cameramanRepository.findById(id).get() != null){
            return cameramanRepository.findById(id).get();
        }
        if(choregrapherRepositoryy.findById(id).get() != null){
            return choregrapherRepositoryy.findById(id).get();
        }
        return null;
    }

    @Override
    public Crewmember createCrewmember(Crewmember crewmember, CrewEnum tip) {
        if(tip==CrewEnum.Cameraman){
            return cameramanRepository.save((Cameraman) crewmember);
        }
        if(tip==CrewEnum.Choregrapher){
            return choregrapherRepositoryy.save((Choregrapher) crewmember);
        }
        if(tip==CrewEnum.Actor){
            return actorCrewmemberRepository.save((Actor) crewmember);
        }
        return null;
    }

    @Override
    public Crewmember updateCrewmember(int id, Crewmember crewmember, CrewEnum tip) {
        if(tip==CrewEnum.Choregrapher){
            Choregrapher user1 = choregrapherRepositoryy.findById(id).get();
            user1.setname(crewmember.getname());
            user1.setAge(crewmember.getAge());
            choregrapherRepositoryy.save(user1);
        }else if(tip==CrewEnum.Cameraman){
            Cameraman user1 = cameramanRepository.findById(id).get();
            user1.setname(crewmember.getname());
            user1.setAge(crewmember.getAge());
            cameramanRepository.save(user1);
        }else if(tip==CrewEnum.Actor){
            Actor user1 = actorCrewmemberRepository.findById(id).get();
            user1.setname(crewmember.getname());
            user1.setAge(crewmember.getAge());
            actorCrewmemberRepository.save(user1);
        }
        return crewmember;
    }

    @Override
    public void deleteCrewmemberByID(int id, CrewEnum tip) {
        if(tip==CrewEnum.Choregrapher){
            choregrapherRepositoryy.deleteById(id);
        }else if(tip==CrewEnum.Cameraman){
            cameramanRepository.deleteById(id);
        }else if(tip==CrewEnum.Actor){
            actorCrewmemberRepository.deleteById(id);
        }
    }
}
