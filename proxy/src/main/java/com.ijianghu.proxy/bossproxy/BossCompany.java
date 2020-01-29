package com.ijianghu.proxy.bossproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author kai on
 * @date 2019/3/12 15:04
 */
public class BossCompany implements InvocationHandler{

    private People target;

    public Object getInstance(People target){
        this.target = target;
        Class<?> aClass = target.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);

    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("你好，请先上传你的个人简历");
    }
    private void after(){
        System.out.println("请继续沟通");
    }
}
