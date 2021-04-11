package headfirst.designpatterns.proxy.dynamics.impl;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyCglib implements MethodInterceptor{

    private Object target;

    public Object getInstance(Object realObject){
        this.target = realObject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        Object obj = enhancer.create();
        return obj;

    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy...");
        Object object = methodProxy.invokeSuper(obj, args);
        System.out.println(object);
        return object;
    }
}
