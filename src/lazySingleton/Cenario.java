package lazySingleton;

public class Cenario extends Thread{

    @Override
    public void run(){
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);
    }
}
