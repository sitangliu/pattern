package com.ijianghu.proxy.reflect.po;

import java.util.List;

/**
 * @author kai on
 * @date 2019/3/13 18:00
 */
public class Student {

    private String name;
    private Integer age;
    private List<String> hobbies;
    private String masterTeacher;

    public String getStudentInfo(){

        return name+age+hobbies+masterTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getMasterTeacher() {
        return masterTeacher;
    }

    public void setMasterTeacher(String masterTeacher) {
        this.masterTeacher = masterTeacher;
    }
}
