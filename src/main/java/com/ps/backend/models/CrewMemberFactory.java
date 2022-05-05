package com.ps.backend.models;

public class CrewMemberFactory {
    private Integer idUser;
    private String username;
    private int age;


    public CrewMemberFactory(String username, int age) {
        this.username = username;
        this.age = age;
    }

    /**
     * This method create a type of CrewMember based of value of CrewEnum
     * @param  e (CrewEnum)
     * @return CrewMember
     */
    public Crewmember createUser(CrewEnum e) {
        Crewmember crewMember;
        if (e == CrewEnum.Cameraman) {
            crewMember = new Cameraman(username,age);
            return crewMember;
        } else if (e == CrewEnum.Actor) {
            crewMember = new Actor(username,age);
            return crewMember;
        } else if (e == CrewEnum.Choregrapher) {
            crewMember = new Choregrapher(username,age);
            return crewMember;
        }
        return null;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
}
