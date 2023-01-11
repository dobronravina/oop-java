package test.java.org.fpm.di.example;

import main.java.org.fpm.di.Binder;
import main.java.org.fpm.di.Configuration;
import test.java.org.fpm.di.example.MyContainer.*;
//import org.fpm.di.Binder;
//import org.fpm.di.Configuration;

public class MyConfiguration implements Configuration {
    @Override
    public void configure(Binder binder) {
        binder.bind(MySingleton.class);
        binder.bind(MyPrototype.class);

        binder.bind(UseA.class);

        binder.bind(A.class, B.class);
        binder.bind(B.class, new B());

        binder.bind(Apple.class);
        binder.bind(Pear.class);
        binder.bind(Banana.class);
        binder.bind(Orange.class);
        binder.bind(AppleRed.class, new AppleRed());

    }
}
