package hu.alkfejl.dao;

import hu.alkfejl.model.Student;
import javafx.beans.property.IntegerProperty;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class StudentDAOImpl implements StudentDAO {

    private static final String SELECT_ALL_STUDENTS = "SELECT * FROM STUDENT";
    Properties props = new Properties();
    private String connectionURL;

    public StudentDAOImpl(){

        try {
            props.load(getClass().getResourceAsStream("/application.properties"));
            connectionURL = props.getProperty("db.url");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> findAll() {

        List<Student> result = new ArrayList<>();

        try(Connection c = DriverManager.getConnection(connectionURL);
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(SELECT_ALL_STUDENTS)
        ){
            while (rs.next()){
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setHId(rs.getString("hId"));
                student.setTelNum(rs.getInt("telNum"));
                student.setDateOfBirth(rs.getString("dateOfBirth"));
                student.setLibraryMember(rs.getBoolean("libraryMember"));

                result.add(student);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;

    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public void delete(Student student) {

    }
}
