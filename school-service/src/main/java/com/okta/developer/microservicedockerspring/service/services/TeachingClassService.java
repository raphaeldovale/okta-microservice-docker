package com.okta.developer.microservicedockerspring.service.services;

import com.okta.developer.microservicedockerspring.service.dtos.TeachingClassDto;

import java.util.List;

public interface TeachingClassService {

    List<TeachingClassDto> listClasses();
}
