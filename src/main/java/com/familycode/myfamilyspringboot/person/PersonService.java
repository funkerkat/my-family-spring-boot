package com.familycode.myfamilyspringboot.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    public List<Person> getPerson(){
        return List.of(new Person("Mila"), new Person("Misha"));
    }
}
