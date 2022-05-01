package com.example.studentserver.entity;

public class Student {
    private String stuno;
    private String classno;
    private String stuname;
    private String sex;
    private String addr;

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Student(String stuno, String classno, String stuname, String sex, String addr) {
        this.stuno = stuno;
        this.classno = classno;
        this.stuname = stuname;
        this.sex = sex;
        this.addr = addr;
    }

    public Student() {
    }
}
