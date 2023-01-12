package test.java.org.fpm.di.example.MyContainer;

import test.java.org.fpm.di.example.Singleton;

@Singleton
public class SommerFood {

    private Fruits fruits;
    @Inject
    public SommerFood(Fruits f){
        this.fruits = f;
    }

    public Fruits getFruits() {
        return fruits;
    }
}
