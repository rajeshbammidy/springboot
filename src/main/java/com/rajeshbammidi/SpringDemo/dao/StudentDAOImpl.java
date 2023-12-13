package com.rajeshbammidi.SpringDemo.dao;

import com.rajeshbammidi.SpringDemo.SpringDemoApplication;
import com.rajeshbammidi.SpringDemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // DAO class has to be repositories
public class StudentDAOImpl implements StudentDao {
    // this is required to communicate with DB
    private EntityManager entityManager;

    @Autowired
    StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);
        return theQuery.getResultList();

    }
}
