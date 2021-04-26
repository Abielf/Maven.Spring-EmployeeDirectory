package io.zipcoder.persistenceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    DepartmentRepository repository;

    @Autowired
    public DepartmentController(DepartmentRepository r){
        repository=r;
    }

    @RequestMapping(value="/departments", method=RequestMethod.POST)
    public ResponseEntity<?> createPoll(@RequestBody Department dept) {
        dept = repository.save(dept);
        return new ResponseEntity<>(dept, HttpStatus.CREATED);
    }



}
