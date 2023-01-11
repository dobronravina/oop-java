package test.java.org.fpm.di.example;

import main.java.org.fpm.di.Binder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import org.fpm.di.Binder;

public class DummyBinder implements Binder {
    @Override
    public <T> void bind(Class<T> clazz) {

    }

    @Override
    public <T> void bind(Class<T> clazz, Class<? extends T> implementation) {

    }

    @Override
    public <T> void bind(Class<T> clazz, T instance) {

    }
}
