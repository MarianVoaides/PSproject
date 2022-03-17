package com.ps.backend.models;

import javax.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 1L;
    @Column(name = "name", nullable = false)
    private String actorname;
    @Column(name = "age", nullable = false)
    private int age;

    public Actor() {
    }

    public Actor(String actorname, int age) {
        super();
        this.actorname = actorname;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getname() {
        return actorname;
    }

    public void setname(String name) {
        this.actorname = name;
    }

    public String getActorname() {
        return actorname;
    }

    public void setActorname(String name) {
        this.actorname = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}


