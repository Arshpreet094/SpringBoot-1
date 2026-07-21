package com.arshpreet.demo.StudentServer.Repository;

import com.arshpreet.demo.StudentServer.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

//    public Student save(Student student){
//        System.out.println("Student data saved!");
//        return student;
//    }
}
