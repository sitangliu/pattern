package com.ijianghu.delegate.employee;

/**
 * @author kai on
 * @date 2019/3/18 10:35
 */
public class EmployeeA implements IEmployee{
    public void doing(String task) {
        System.out.println("我擅长使用设计模式开发优雅的业务代码，我开始做"+task);
    }
}
