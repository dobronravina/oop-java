package test.java.org.fpm.di.example.MyContainer;

import test.java.org.fpm.di.example.Singleton;

@Singleton
public class Apple {
 private AppleRed appleRed;
 @Inject
 public Apple(AppleRed appleR){
     this.appleRed = appleR;
 }

    public AppleRed getAppleRed() {
        return appleRed;
    }
}
