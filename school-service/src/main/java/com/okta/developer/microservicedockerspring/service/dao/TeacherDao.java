package com.okta.developer.microservicedockerspring.service.dao;

import com.okta.developer.microservicedockerspring.service.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherDao extends JpaRepository<Teacher, Long> {

    List<Teacher> findByNameContaining(String name);
}
