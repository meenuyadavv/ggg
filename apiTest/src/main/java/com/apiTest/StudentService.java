package com.apiTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Save student
    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    // Get all students
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

}
