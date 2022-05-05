package com.ps.backend.controllers;

import com.ps.backend.models.CrewEnum;
import com.ps.backend.services.ICrewmemberService;
import com.ps.backend.models.Crewmember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * The type Crewmember controller.
 */
@RestController
@RequestMapping("/crewmember")
public class CrewmemberController {

    @Autowired
    private ICrewmemberService crewmemberService;

    /**
     * Instantiates a new Crewmember controller.
     *
     * @param crewmemberService the crewmember service
     */
    public CrewmemberController(ICrewmemberService crewmemberService) {
        this.crewmemberService = crewmemberService;
    }

    /**
     * Get crewmember.
     *
     * @param id the id
     * @return the crewmember
     */
    @GetMapping("")
    public Crewmember get(@RequestParam int id)
    {
        return crewmemberService.getCrewmemberByID(id);
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    @GetMapping("/all")
    public List<Crewmember> getAll(@RequestParam CrewEnum tip)
    {
        return crewmemberService.getCrewmembers(tip);
    }

    /**
     * Post crewmember.
     *
     * @param tip the CrewEnum
     * @param crewmember the Crewmember
     * @return the crewmember
     */
    @PostMapping("")
    public Crewmember post(@RequestParam CrewEnum tip, @RequestBody Crewmember crewmember) {
        crewmemberService.createCrewmember(crewmember,tip);
        return crewmember;
    }

    /**
     * Delete crewmembername.
     *
     * @param tip the CrewEnum
     * @param id the id
     */
    @DeleteMapping("")
    public void deleteCrewmembername(@RequestParam CrewEnum tip, @RequestParam int id) {
        crewmemberService.deleteCrewmemberByID(id, tip);
    }

    /**
     * Put crewmember.
     *
     * @param id the id
     * @param tip the tip
     * @param crewmember the crewmember
     * @return the crewmember
     */
    @PutMapping("")
    public Crewmember put(@RequestParam int id, CrewEnum tip, @RequestBody Crewmember crewmember) {
        return crewmemberService.updateCrewmember(id, crewmember, tip);
    }
}
