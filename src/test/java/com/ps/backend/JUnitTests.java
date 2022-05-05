package com.ps.backend;

import com.ps.backend.controllers.CrewmemberController;
import com.ps.backend.models.*;
import com.ps.backend.services.CrewmemberService;
import org.apache.catalina.authenticator.SavedRequest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class JUnitTests {

    @InjectMocks
    CrewmemberController crewmemberController;

    @Mock
    CrewmemberService crewmemberService;

    /**
     * Test to get all objects
     */
    @Test
    public void testFindAll() {
        Crewmember crewmember1 = new Actor("Andrei",20);
        Crewmember crewmember2 = new Actor("Andresdi",21);
        List<Crewmember> crewmemberList = new ArrayList<>();
        crewmemberList.add(crewmember1);
        crewmemberList.add(crewmember2);

        when(crewmemberService.getCrewmembers(CrewEnum.Actor)).thenReturn(crewmemberList);

        List<Crewmember> result = crewmemberController.getAll(CrewEnum.Actor);

        assertThat(result.size()).isEqualTo(2);
        assertThat(result.get(0).getname()).isEqualTo(crewmember1.getname());
        assertThat(result.get(1).getname()).isEqualTo(crewmember2.getname());
    }

    /**
     * Test for get a single object by id of item
     */
    @Test
    public void getCrewmemberbyIdTest(){
        Crewmember crewmember1 = new Actor("Andrei",20);

        when(crewmemberService.getCrewmemberByID(1)).thenReturn(crewmember1);

        Crewmember result = crewmemberController.get(1);

        assertThat(result.getname()).isEqualTo(crewmember1.getname());
    }

    /**
     * Testing for delete an object by id of object
     */
    @Test
    public void deleteCrewmemberIdTest(){
        Crewmember crewmember1 = new Actor("FASdasd",44);
        crewmemberService.deleteCrewmemberByID(1,CrewEnum.Actor);

        crewmemberController.deleteCrewmembername(CrewEnum.Actor,1);
    }

    @Test
    public void assertActorTest1(){
        CrewMemberFactory crewMemberFactory = new CrewMemberFactory("Razvan", 54);
        Actor actor = (Actor) crewMemberFactory.createUser(CrewEnum.Actor);
        Actor actor1 = new Actor("Razvan", 54);
        assertEquals("Rezultatul: ", actor.getActorname(), actor1.getActorname());
        assertEquals("Rezultatul: ", actor.getAge(), actor1.getAge());
    }

    @Test
    public void assertCameramanTest1(){
        CrewMemberFactory crewMemberFactory = new CrewMemberFactory("Razvan", 54);
        Cameraman actor = (Cameraman) crewMemberFactory.createUser(CrewEnum.Cameraman);
        Cameraman actor1 = new Cameraman("Razvan", 54);
        assertEquals("Rezultatul: ", actor.getCameramanname(), actor1.getCameramanname());
        assertEquals("Rezultatul: ", actor.getAge(), actor1.getAge());
    }

    @Test
    public void assertChoregrapherTest1(){
        CrewMemberFactory crewMemberFactory = new CrewMemberFactory("Razvan", 54);
        Choregrapher actor = (Choregrapher) crewMemberFactory.createUser(CrewEnum.Choregrapher);
        Choregrapher actor1 = new Choregrapher("Razvan", 54);
        assertEquals("Rezultatul: ", actor.getChoregraphername(), actor1.getChoregraphername());
        assertEquals("Rezultatul: ", actor.getAge(), actor1.getAge());
    }

    @Test
    public void assertMovieTest1(){
        Movie crewmember1 = new Movie("dsds","dsds","dsds");
        Movie crewmember2 = new Movie("dsds","dsds","dsds");
        assertEquals("Rezultatul: ", crewmember1.getFilmDirector(), crewmember2.getFilmDirector());
        assertEquals("Rezultatul: ", crewmember1.getGenre(), crewmember2.getGenre());
        assertEquals("Rezultatul: ", crewmember1.getMoviename(), crewmember2.getMoviename());
    }

    @Test
    public void assertActorTest(){
        CrewMemberFactory crewMemberFactory = new CrewMemberFactory("Razvan", 54);
        Actor actor = (Actor) crewMemberFactory.createUser(CrewEnum.Actor);
        Actor actor1 = new Actor("Razvan", 54);
        assertEquals("Rezultatul: ", actor.getActorname(), actor1.getActorname());
        assertEquals("Rezultatul: ", actor.getAge(), actor1.getAge());
    }

    @Test
    public void assertCameramanTest(){
        CrewMemberFactory crewMemberFactory = new CrewMemberFactory("Razvan", 54);
        Cameraman actor = (Cameraman) crewMemberFactory.createUser(CrewEnum.Cameraman);
        Cameraman actor1 = new Cameraman("Razvan", 54);
        assertEquals("Rezultatul: ", actor.getCameramanname(), actor1.getCameramanname());
        assertEquals("Rezultatul: ", actor.getAge(), actor1.getAge());
    }

    @Test
    public void assertChoregrapherTest(){
        CrewMemberFactory crewMemberFactory = new CrewMemberFactory("Razvan", 54);
        Choregrapher actor = (Choregrapher) crewMemberFactory.createUser(CrewEnum.Choregrapher);
        Choregrapher actor1 = new Choregrapher("Razvan", 54);
        assertEquals("Rezultatul: ", actor.getChoregraphername(), actor1.getChoregraphername());
        assertEquals("Rezultatul: ", actor.getAge(), actor1.getAge());
    }

    @Test
    public void assertMovieTest(){
        Movie crewmember1 = new Movie("dsds","dsds","dsds");
        Movie crewmember2 = new Movie("dsds","dsds","dsds");
        assertEquals("Rezultatul: ", crewmember1.getFilmDirector(), crewmember2.getFilmDirector());
        assertEquals("Rezultatul: ", crewmember1.getGenre(), crewmember2.getGenre());
        assertEquals("Rezultatul: ", crewmember1.getMoviename(), crewmember2.getMoviename());
    }



}
