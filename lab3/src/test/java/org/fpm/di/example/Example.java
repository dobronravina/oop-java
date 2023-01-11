package test.java.org.fpm.di.example;

import main.java.org.fpm.di.Container;
import main.java.org.fpm.di.Environment;
//import org.fpm.di.Container;
//import org.fpm.di.Environment;
import org.junit.Before;
import org.junit.Test;
import test.java.org.fpm.di.example.MyContainer.*;


import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class Example {

    private Container container;

    @Before
    public void setUp() {
        Environment env = new DummyEnvironment();
        container = env.configure(new MyConfiguration());
    }

    @Test
    public void shouldInjectSingleton() {
        assertSame(container.getComponent(MySingleton.class), container.getComponent(MySingleton.class));
    }

    @Test
    public void shouldInjectPrototype() {
        assertNotSame(container.getComponent(MyPrototype.class), container.getComponent(MyPrototype.class));
    }

    @Test
    public void shouldBuildInjectionGraph() {


       /* binder.bind(A.class, B.class);
        binder.bind(B.class, new B());*/
        final B bAsSingleton = container.getComponent(B.class);
        assertSame(container.getComponent(A.class), bAsSingleton);
        assertSame(container.getComponent(B.class), bAsSingleton);
    }

    @Test
    public void shouldBuildInjectDependencies() {
        final UseA hasADependency = container.getComponent(UseA.class);
        assertSame(hasADependency.getDependency(), container.getComponent(B.class));
    }


    @Test
    public void myTestApple(){

        Apple apple = container.getComponent(Apple.class);
        assertSame(apple, container.getComponent(Apple.class));

    }


    @Test
    public void myTestPear(){

        Pear pear = container.getComponent(Pear.class);
        assertSame(pear, container.getComponent(Pear.class));

    }

    @Test
    public void myTestBanana(){

        Banana banana = container.getComponent(Banana.class);
        assertSame(banana, container.getComponent(Banana.class));

    }

    @Test
    public void myTestOrange(){

       Orange orange = container.getComponent(Orange.class);
       assertSame(orange, container.getComponent(Orange.class));
    }

}

