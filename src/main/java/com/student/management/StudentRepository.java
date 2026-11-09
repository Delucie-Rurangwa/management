package com.student.management;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    public void save(Student student) {
        // we will write the INSERT here in Part E
    }

    public List<Student> getAllStudents() {
        // we will write the SELECT here in Part E
        return new ArrayList<>();
    }
}