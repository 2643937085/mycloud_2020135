package com.example.eurekafeignclient.service;

import com.alibaba.fastjson.JSONObject;
import com.example.eurekafeignclient.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
@FeignClient(name = "studentserver",fallback = Abc.class)
public interface FeignService {
    @RequestMapping(value = "/api/v1/student/list",method = RequestMethod.GET)
    public List<Student> getAllStudent();

    @RequestMapping(value = "/api/v1/student/insert",method = RequestMethod.POST)
    public JSONObject insertStudent(@RequestBody Student t);

    @RequestMapping(value = "/api/v1/student/getbyid/{stuno}",method = RequestMethod.GET)
    public JSONObject getbyid(@PathVariable(value = "stuno") String stuno);

    @RequestMapping(value = "/api/v1/student/update",method = RequestMethod.POST)
    public JSONObject update(@RequestBody Student t);

    @RequestMapping(value = "/api/v1/student/delete/{stuno}",method = RequestMethod.GET)
    public JSONObject delete(@PathVariable(value = "stuno") String stuno);
}
