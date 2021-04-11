package headfirst.designpatterns.proxy.statics.impl;

import headfirst.designpatterns.proxy.origin.impl.RealSubject;
import headfirst.designpatterns.proxy.interfaces.Subject;

public class ProxySubject implements Subject {
    private Subject subject;

    @Override
    public void operate() {
        if (null == subject){
            subject = new RealSubject();
            System.out.println("This is in the static proxiy.");
            subject.operate();
        }
    }
}
