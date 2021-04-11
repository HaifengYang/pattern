package headfirst.designpatterns.proxy.origin.impl;

import headfirst.designpatterns.proxy.interfaces.Subject;

public class RealSubject implements Subject {
    @Override
    public void operate() {
        System.out.println("RealSubject");
    }
}
