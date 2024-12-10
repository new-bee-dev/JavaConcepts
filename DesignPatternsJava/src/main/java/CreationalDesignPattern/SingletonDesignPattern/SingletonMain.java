package main.java.CreationalDesignPattern.SingletonDesignPattern;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getSingletonInstance();
        SingletonClass s2 = SingletonClass.getSingletonInstance();
        if (s1 == s2)
            System.out.println("same instance found!");

        SingletonLazy s3 = SingletonLazy.getSingletonLazyObj();
        SingletonLazy s4 = SingletonLazy.getSingletonLazyObj();
        if (s3 == s4)
            System.out.println("same instance found!");
    }
}
