package headfirst.designpatterns.proxy.statics.test;

import headfirst.designpatterns.proxy.statics.impl.ProxySubject;
import headfirst.designpatterns.proxy.interfaces.Subject;

public class Test {
    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.operate();
    }
}
