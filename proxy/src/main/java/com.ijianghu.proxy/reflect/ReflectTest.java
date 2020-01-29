package com.ijianghu.proxy.reflect;

import com.ijianghu.proxy.reflect.po.Student;

import java.lang.reflect.Method;

/**
 * @author kai on
 * @date 2019/3/13 20:23
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName(Student.class.getName());
        Student instance = (Student)clazz.newInstance();
        instance.setName("dandanjie");
        instance.setAge(18);
        Method setName = clazz.getMethod("setName",String.class);
        setName.invoke(instance, "liukai");
        Method getStudentInfo = clazz.getMethod("getStudentInfo", null);
        String studentInfo = (String)getStudentInfo.invoke(instance, null);


        System.out.println(studentInfo);


    }

}
