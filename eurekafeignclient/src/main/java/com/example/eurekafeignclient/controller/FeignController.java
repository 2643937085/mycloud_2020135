package com.example.eurekafeignclient.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.eurekafeignclient.entity.Student;
import com.example.eurekafeignclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FeignController {
    @Autowired
    FeignService fs;
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public List<Student> getlist(){
        return fs.getAllStudent();
    }
    @RequestMapping(value="/insert",method = RequestMethod.POST)
    public JSONObject insertStudent(@RequestBody Student t){
        return fs.insertStudent(t);
    }
    @RequestMapping(value="/getbyid/{stuno}",method = RequestMethod.GET)
    public JSONObject getbyid(@PathVariable(value = "stuno") String stuno){
        return fs.getbyid(stuno);
    }

   @RequestMapping(value="/update/{stuno}",method = RequestMethod.POST)
    public JSONObject update(@RequestBody Student t){
        return fs.update(t);
    }
    @RequestMapping(value="/delete/{stuno}",method = RequestMethod.GET)
    public JSONObject delete(@PathVariable(value = "stuno") String stuno){
        return fs.delete(stuno);
    }


}
