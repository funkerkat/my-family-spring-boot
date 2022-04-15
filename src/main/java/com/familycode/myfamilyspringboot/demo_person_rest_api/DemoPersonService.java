package com.familycode.myfamilyspringboot.demo_person_rest_api;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoPersonService {

    public List<DemoPerson> getPerson(){
        return List.of(new DemoPerson("Mila"), new DemoPerson("Misha"));
    }
}
