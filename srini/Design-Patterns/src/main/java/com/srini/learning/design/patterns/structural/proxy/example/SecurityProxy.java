package com.srini.learning.design.patterns.structural.proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author - srini91
 * @see <a href="https://srini91.in">blog</a>
 * @see <a href="https://github.com/srinivaschannakeshava">github</a>
 */
public class SecurityProxy implements InvocationHandler {
    private Object obj;

    private SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new SecurityProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        System.out.println("Inside Security proxy invoke");
        int count = 0;
        for (Object arg : args) {
            if (arg instanceof String) {
                args[count] = arg + " modified";
            }
            count++;
        }
        result = method.invoke(obj, args);
        return result;
    }
}
