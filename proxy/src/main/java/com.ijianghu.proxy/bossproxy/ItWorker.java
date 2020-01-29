package com.ijianghu.proxy.bossproxy;

/**
 * @author kai on
 * @date 2019/3/12 15:02
 */
public class ItWorker implements People{

    private String name;
    private Integer age;

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

    public void findJob() {
        System.out.println("我想要找一份高薪Java工作");
    }
}
