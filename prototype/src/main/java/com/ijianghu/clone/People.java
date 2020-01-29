package com.ijianghu.clone;

/**
 * Created by 24596 on 2019/9/26.
 */
public class People implements Cloneable{

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        People people = new People();
        people.setAge(23);
        people.setName("yaoyao");

        //创建了一个新的对象
        People clone = (People)people.clone();
        System.out.println(clone);
        System.out.println(people);
        System.out.println(clone == people);//false

        //clone()方法 执行的是浅拷贝 对象属性
        System.out.println(clone.getAge() == people.getAge());
        System.out.println(clone.getName() == people.getName()?clone.getName():people.getName());// true
        people.setName("kaikai");
        System.out.println(people.getName());
        System.out.println(clone.getName());
    }

}
