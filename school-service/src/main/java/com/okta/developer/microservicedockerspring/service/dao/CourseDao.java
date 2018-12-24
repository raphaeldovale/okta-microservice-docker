package com.okta.developer.microservicedockerspring.service.dao;

import com.okta.developer.microservicedockerspring.service.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {
}
