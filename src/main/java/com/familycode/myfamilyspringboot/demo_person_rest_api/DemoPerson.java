package com.familycode.myfamilyspringboot.demo_person_rest_api;

public class DemoPerson {

    private String name;
    private int yearOfBirth;

    public DemoPerson(String name) {
        this.name = name;
    }

    public DemoPerson(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
