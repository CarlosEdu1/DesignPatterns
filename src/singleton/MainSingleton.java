package singleton;

public class MainSingleton {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
