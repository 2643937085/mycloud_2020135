package com.example.consumer.controller;

import com.alibaba.fastjson.JSONArray;
import com.example.consumer.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    RibbonService rs;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public JSONArray getlist(){
        return rs.getstudentlist();
    }
}
