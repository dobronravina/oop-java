package test.java.org.fpm.di.example;

import main.java.org.fpm.di.Container;
import test.java.org.fpm.di.example.MyContainer.Inject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
//import org.fpm.di.Container;

public class DummyContainer implements Container {
    @Override
    public <T> T getComponent(Class<T> clazz) {
        if (clazz.equals(A.class)) {
            return (T) new A();
        }
        if (clazz.equals(B.class)) {
            return (T) new B();
        }
        return null;
    }}
