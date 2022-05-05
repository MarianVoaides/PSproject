package com.ps.backend.models;

import com.ps.backend.repositories.MovieRepository;

import javax.persistence.*;
import java.util.List;

/**
 * The type Cameraman.
 */
@Entity
@Table(name = "cameraman")
public class Cameraman implements Crewmember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 1L;
    @Column(name = "name", nullable = false)
    private String cameramanname;
    @Column(name = "age", nullable = false)
    private int age;

    /**
     * Instantiates a new Cameraman.
     */
    public Cameraman() {
    }

    /**
     * Instantiates a new Cameraman.
     *
     * @param cameramanname the cameramanname
     * @param age       the age
     */
    public Cameraman(String cameramanname, int age) {
        super();
        this.cameramanname = cameramanname;
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
        return cameramanname;
    }

    /**
     * Sets .
     *
     * @param name the name
     */
    public void setname(String name) {
        this.cameramanname = name;
    }


    /**
     * Gets cameramanname.
     *
     * @return the cameramanname
     */
    public String getCameramanname() {
        return cameramanname;
    }

    /**
     * Sets cameramanname.
     *
     * @param name the name
     */
    public void setCameramanname(String name) {
        this.cameramanname = name;
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
















