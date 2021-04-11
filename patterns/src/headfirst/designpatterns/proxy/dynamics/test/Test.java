package headfirst.designpatterns.proxy.dynamics.test;

import headfirst.designpatterns.proxy.dynamics.impl.ProxyCglib;
import headfirst.designpatterns.proxy.interfaces.Subject;
import headfirst.designpatterns.proxy.origin.impl.RealSubject;

public class Test {
    public static void main(String[] args) {
//        Subject subject = (Subject) new ProxyHandler().newProxyInstance(new RealSubject());
//        subject.operate();

        Subject ciglibSubject = (Subject) new ProxyCglib().getInstance(new RealSubject());
        ciglibSubject.operate();

    }
}
