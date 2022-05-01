package com.example.studentserver.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.studentserver.entity.Student;
import com.example.studentserver.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
    StudentService ss;
    @Value("${server.port}")
    String port;

    @RequestMapping(value="/list",method=RequestMethod.GET)
    public List<Student> getAllStudent(){
        System.out.println("lost"+port);
        return ss.getAllStudent();
    }
    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public JSONObject insertStudent(@RequestBody Student t){
        JSONObject js=new JSONObject();
        int i=ss.insertStudent(t);
        js.put("flag",i);
        return js;
    }
    @RequestMapping(value="/update",method=RequestMethod.POST)
    public JSONObject updateStudent(@RequestBody Student t){
        JSONObject js=new JSONObject();
        int i=ss.updateStudent(t);
        js.put("flag",i);
        return js;
    }
    @RequestMapping(value="/getbyid/{stuno}",method=RequestMethod.GET)
    public JSONObject getbyid(@PathVariable String stuno){
        JSONObject js=new JSONObject();
        Student t=null;
        t=ss.getStudentById(stuno);
        if(t!=null){
            js.put("flag",1);
            js.put("t",t);
        }else{
            js.put("flag",0);
        }
        return js;
    }

    @RequestMapping(value="/delete/{stuno}",method=RequestMethod.GET)
    public JSONObject delete(@PathVariable String stuno){
        JSONObject js=new JSONObject();
        int i=ss.deleteStudent(stuno);
        js.put("flag",i);
        return js;
    }
}
