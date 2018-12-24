package com.okta.developer.microservicedockerspring.service.dao;

import com.okta.developer.microservicedockerspring.service.entities.TeachingClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeachingClassDao extends JpaRepository<TeachingClass, Long> {}
