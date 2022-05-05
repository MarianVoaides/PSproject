package com.ps.backend.services;

import com.ps.backend.models.CrewEnum;
import com.ps.backend.models.Crewmember;


import java.util.List;

/**
 * Is an interface for declaration of methods which will applied for crewmember table
 */
public interface ICrewmemberService {
    /**
     * @return List crewmembers
     */
    List<Crewmember> getCrewmembers(CrewEnum tip);

    /**
     * @param id integer
     * @return Crewmember
     */
    Crewmember getCrewmemberByID(int id);

    /**
     * @param crewmember object
     * @return Crewmember
     */
    Crewmember createCrewmember(Crewmember crewmember, CrewEnum tip);

    /**
     * @param id         integer
     * @param crewmember object
     * @return
     */
    Crewmember updateCrewmember(int id, Crewmember crewmember, CrewEnum tip);

    /**
     * @param id integer
     */
    void deleteCrewmemberByID(int id, CrewEnum tip);
}
