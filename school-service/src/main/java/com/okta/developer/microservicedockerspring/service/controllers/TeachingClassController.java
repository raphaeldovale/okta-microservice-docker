package com.okta.developer.microservicedockerspring.service.controllers;


import com.okta.developer.microservicedockerspring.service.dtos.TeachingClassDto;
import com.okta.developer.microservicedockerspring.service.services.TeachingClassService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/class")
public class TeachingClassController {


    private final TeachingClassService teachingClassService;

    public TeachingClassController(TeachingClassService teachingClassService) {
        this.teachingClassService = teachingClassService;
    }

    @GetMapping
    public List<TeachingClassDto> listClasses(){
        return teachingClassService.listClasses();
    }



}
