package com.ps.backend.models;

import javax.persistence.*;

/**
 * The type Actor.
 */
@Entity
@Table(name = "actor")
public class Actor implements Crewmember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 1L;
    @Column(name = "name", nullable = false)
    private String actorname;
    @Column(name = "age", nullable = false)
    private int age;

    /**
     * Instantiates a new Actor.
     */
    public Actor() {
    }

    /**
     * Instantiates a new Actor.
     *
     * @param actorname the actorname
     * @param age       the age
     */
    public Actor(String actorname, int age) {
        super();
        this.actorname = actorname;
        this.age = age;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets .
     *
     * @return the
     */
    public String getname() {
        return actorname;
    }

    /**
     * Sets .
     *
     * @param name the name
     */
    public void setname(String name) {
        this.actorname = name;
    }


    /**
     * Gets actorname.
     *
     * @return the actorname
     */
    public String getActorname() {
        return actorname;
    }

    /**
     * Sets actorname.
     *
     * @param name the name
     */
    public void setActorname(String name) {
        this.actorname = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

}


