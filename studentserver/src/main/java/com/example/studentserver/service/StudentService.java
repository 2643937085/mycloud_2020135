package com.example.studentserver.service;

import com.example.studentserver.dao.StudentDao;
import com.example.studentserver.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDao sd;

    public List<Student> getAllStudent(){
        return sd.getAllStudent();
    }

    public int insertStudent(Student t){
        return sd.insertStudent(t);
    }

    public int updateStudent(Student t){
        return sd.updateStudent(t);
    }

    public int deleteStudent(String stuno){
        return sd.deleteStudent(stuno);
    }

    public Student getStudentById(String stuno){
        return sd.getStudentById(stuno);
    }
}
