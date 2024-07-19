package com.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
