package test.java.org.fpm.di.example;

import main.java.org.fpm.di.Configuration;
import main.java.org.fpm.di.Container;
import main.java.org.fpm.di.Environment;
/*import org.fpm.di.Configuration;
import org.fpm.di.Container;
import org.fpm.di.Environment;*/

public class DummyEnvironment implements Environment {

    @Override
    public Container configure(Configuration configuration) {
        return new DummyContainer();
    }
}
