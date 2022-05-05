package com.ps.backend.models;

import javax.persistence.*;

/**
 * The type Choregrapher.
 */
@Entity
@Table(name = "choregrapher")
public class Choregrapher implements Crewmember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 1L;
    @Column(name = "name", nullable = false)
    private String choregraphername;
    @Column(name = "age", nullable = false)
    private int age;

    /**
     * Instantiates a new Choregrapher.
     */
    public Choregrapher() {
    }

    /**
     * Instantiates a new Choregrapher.
     *
     * @param choregraphername the choregraphername
     * @param age       the age
     */
    public Choregrapher(String choregraphername, int age) {
        super();
        this.choregraphername = choregraphername;
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
        return choregraphername;
    }

    /**
     * Sets .
     *
     * @param name the name
     */
    public void setname(String name) {
        this.choregraphername = name;
    }


    /**
     * Gets choregraphername.
     *
     * @return the choregraphername
     */
    public String getChoregraphername() {
        return choregraphername;
    }

    /**
     * Sets choregraphername.
     *
     * @param name the name
     */
    public void setChoregraphername(String name) {
        this.choregraphername = name;
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


