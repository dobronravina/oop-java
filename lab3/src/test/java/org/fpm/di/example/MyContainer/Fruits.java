package test.java.org.fpm.di.example.MyContainer;

import test.java.org.fpm.di.example.Singleton;

@Singleton
public class Fruits {

    private Apple apple;
    private Pear pear;
    private Banana banana;
    private Orange orange;

    @Inject
    public Fruits(Apple a,Pear p,Banana b , Orange o){
        this.apple = a;
        this.pear = p;
        this.banana = b;
        this.orange = o;
    }

    public Apple getApple() {
        return apple;
    }

    public Pear getPear() {
        return pear;
    }

    public Banana getBanana() {
        return banana;
    }

    public Orange getOrange(){
        return orange;
    }
}
