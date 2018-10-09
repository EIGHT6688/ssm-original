package com.qd.ssm.original.service.impl;

import com.qd.ssm.original.entity.Student;
import com.qd.ssm.original.mapper.StudentMapper;
import com.qd.ssm.original.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> getStudent() {

        return studentMapper.findAll();
    }
}
