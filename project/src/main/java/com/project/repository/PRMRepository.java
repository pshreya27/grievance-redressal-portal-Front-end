package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.entity.PRMEntity;

@Repository
public interface PRMRepository extends JpaRepository<PRMEntity, Long> {
}
