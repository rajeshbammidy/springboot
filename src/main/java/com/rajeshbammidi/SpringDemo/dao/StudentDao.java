package com.rajeshbammidi.SpringDemo.dao;

import com.rajeshbammidi.SpringDemo.entity.Student;

import java.util.List;

public interface StudentDao {
    public void save(Student student);

    public Student findById(Integer id);

    public List<Student> findAll();
}
