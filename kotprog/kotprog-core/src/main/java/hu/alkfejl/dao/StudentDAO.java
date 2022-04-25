package hu.alkfejl.dao;

import hu.alkfejl.model.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> findAll();

    Student save(Student student);

    void delete(Student student);
}
