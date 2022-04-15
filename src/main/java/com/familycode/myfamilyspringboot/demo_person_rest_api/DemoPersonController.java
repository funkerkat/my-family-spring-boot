package com.familycode.myfamilyspringboot.demo_person_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/person")
public class DemoPersonController {

    private final DemoPersonService demoPersonService;

    @Autowired
    public DemoPersonController(DemoPersonService demoPersonService) {
        this.demoPersonService = demoPersonService;
    }

    @GetMapping
    public List<DemoPerson> getPerson(){
        return demoPersonService.getPerson();
    }
}
