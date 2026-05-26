package com.atharv.bowlekar.LearningRESTAPIs.repository;

import com.atharv.bowlekar.LearningRESTAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
