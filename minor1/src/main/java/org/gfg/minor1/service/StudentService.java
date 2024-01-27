package org.gfg.minor1.service;

import org.gfg.minor1.model.Student;
import org.gfg.minor1.repository.StudentRepository;
import org.gfg.minor1.request.StudentCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public Student createStudent(StudentCreateRequest studentCreateRequest) {
        Student studentFromDB = studentRepository.findByPhoneNo(studentCreateRequest.getPhoneNo());
        if(studentFromDB == null){
            studentFromDB = studentRepository.save(studentCreateRequest.toStudent());
        }
        return studentFromDB;
    }
}
