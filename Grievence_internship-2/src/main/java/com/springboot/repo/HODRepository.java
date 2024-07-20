package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.HODEntity;

@Repository
public interface HODRepository extends JpaRepository<HODEntity, Long> {
}
