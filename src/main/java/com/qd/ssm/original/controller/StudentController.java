package com.qd.ssm.original.controller;

import com.google.gson.Gson;
import com.qd.ssm.original.entity.Student;
import com.qd.ssm.original.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "get" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getStudent(){
        List<Student> students = studentService.getStudent();
        Gson gson = new Gson();
        String json = gson.toJson(students);
        return json;
    }
}
