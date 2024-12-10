package main.java.CreationalDesignPattern.SingletonDesignPattern;

// Early instantiation
public class SingletonClass {
    private static SingletonClass singletonClassObj = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getSingletonInstance() {
        return singletonClassObj;
    }
}

//laze instantiation
class SingletonLazy {
    private static SingletonLazy singletonLazyObj;

    private SingletonLazy() {
    }

    public static SingletonLazy getSingletonLazyObj() {
        if (singletonLazyObj == null)
            synchronized (SingletonLazy.class) {
                if (singletonLazyObj == null)
                    singletonLazyObj = new SingletonLazy();
            }

        return singletonLazyObj;
    }
}
