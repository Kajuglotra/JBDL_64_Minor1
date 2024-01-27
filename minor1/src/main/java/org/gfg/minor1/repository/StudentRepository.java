package org.gfg.minor1.repository;

import org.gfg.minor1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByPhoneNo(String phoneNo);
}
