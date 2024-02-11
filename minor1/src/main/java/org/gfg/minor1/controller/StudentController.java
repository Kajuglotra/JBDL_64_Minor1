package org.gfg.minor1.controller;

import org.gfg.minor1.exception.TxnException;
import org.gfg.minor1.model.Student;
import org.gfg.minor1.request.StudentCreateRequest;
import org.gfg.minor1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody StudentCreateRequest studentCreateRequest) throws TxnException {
        // put validation, student phone is blank throw an excception
        if(StringUtils.isEmpty(studentCreateRequest.getPhoneNo())){
           throw new TxnException("student phone no can not be null.");
        }
        return studentService.createStudent(studentCreateRequest);
    }
}
