package headfirst.designpatterns.proxy.dynamics.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {
    private Object obj;

    public Object newProxyInstance(Object realObj){
        this.obj = realObj;
        Class<?> classType = this.obj.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("This is dynamic proxy invoking...");
        method.invoke(obj, args);
        System.out.println("invoke end");
        return null;
    }
}
