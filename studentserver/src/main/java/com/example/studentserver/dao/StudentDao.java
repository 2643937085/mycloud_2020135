package com.example.studentserver.dao;

import com.example.studentserver.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentDao {
    @Select("select * from student")
    List<Student> getAllStudent();

    @Insert("insert into student(stuno,classno,stuname,sex,addr) values(#{stuno},#{classno},#{stuname},#{sex},#{addr})")
    int insertStudent(Student t);

    @Update("update student set classno=#{classno},stuname=#{stuname},sex=#{sex},addr=#{addr} where stuno=#{stuno}")
    int updateStudent(Student t);

    @Delete("delete from student where stuno=#{stuno}")
    int deleteStudent(String stuno);

    @Select("select * from student where stuno=#{stuno}")
    Student getStudentById(String stuno);

}
