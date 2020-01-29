package com.ijianghu.proxy.custom;

import com.ijianghu.proxy.bossproxy.People;

import java.lang.reflect.Method;

/**
 * @author kai on
 * @date 2019/3/17 16:51
 */
public class StBossCompany implements STInvocationHandler{


    private Object target;


    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return STProxy.newProxyInstance(new STClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target, args);
        after();
        return invoke;
    }

    private void before(){
        System.out.println("我是ST招聘公司，你好，请先上传你的个人简历");
    }
    private void after(){
        System.out.println("请继续沟通");
    }
}
