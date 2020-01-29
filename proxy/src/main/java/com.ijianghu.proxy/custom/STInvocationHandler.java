package com.ijianghu.proxy.custom;

import java.lang.reflect.Method;

/**
 * @author kai on
 * @date 2019/3/13 15:21
 */
public interface STInvocationHandler {

    public Object invoke(Object proxy, Method method,Object args[]) throws Throwable;
}
