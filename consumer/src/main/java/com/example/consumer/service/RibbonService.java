package com.example.consumer.service;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;
    public JSONArray getstudentlist(){
        String uri="http://studentserver/api/v1/student/list";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<JSONArray> rsj = restTemplate.exchange(uri, HttpMethod.GET, entity, JSONArray.class);
        JSONArray rej = rsj.getBody();
        return rej;
    }
}
