package lazySingleton.lazy2;

public class CenarioLazy extends Thread{

    @Override
    public void run(){
        QuantidadeLazy quantidadeLazy = QuantidadeLazy.getSingleton();
        System.out.println(quantidadeLazy);
    }
}
