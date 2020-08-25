package com.guoguo.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String name;
    private String sex;
    private String grade;
    private String classe;
    private String major;
    private String department;



    public Student(){


    }

    public Student(String id, String name, String sex, String grade, String classe, String major, String department) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.grade = grade;
        this.classe = classe;
        this.major = major;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", classe='" + classe + '\'' +
                ", major='" + major + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
