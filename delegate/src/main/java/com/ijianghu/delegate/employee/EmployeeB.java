package com.ijianghu.delegate.employee;

/**
 * @author kai on
 * @date 2019/3/18 10:37
 */
public class EmployeeB implements IEmployee{
    public void doing(String task) {
        System.out.println("我擅长架构设计"+task);
    }
}
