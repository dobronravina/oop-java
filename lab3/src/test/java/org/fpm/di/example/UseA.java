package test.java.org.fpm.di.example;

import test.java.org.fpm.di.example.MyContainer.Inject;

public class UseA {
    private final A dependency;

    @Inject
    public UseA(A a) {
        this.dependency = a;
    }

    public A getDependency() {
        return dependency;
    }
}
