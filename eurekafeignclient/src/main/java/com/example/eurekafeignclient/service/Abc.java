package com.example.eurekafeignclient.service;

import com.alibaba.fastjson.JSONObject;
import com.example.eurekafeignclient.entity.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Abc implements FeignService{

    @Override
    public List<Student> getAllStudent() {
        List<Student> ls=new ArrayList<Student>();
        Student student = new Student();
        student.setAddr("调用微服务故障");
        ls.add(student);
        return ls;
    }

    @Override
    public JSONObject insertStudent(Student t) {
        JSONObject js = new JSONObject();
        js.put("flag","添加服务故障");
        return js;
    }

    @Override
    public JSONObject getbyid(String stuno) {
        JSONObject js = new JSONObject();
        js.put("flag","根据id获取数据服务故障");
        return js;
    }

    @Override
    public JSONObject update(Student t) {
        JSONObject js = new JSONObject();
        js.put("flag","更新服务故障");
        return js;
    }

    @Override
    public JSONObject delete(String stuno) {
        JSONObject js = new JSONObject();
        js.put("flag","删除服务故障");
        return js;
    }
}
