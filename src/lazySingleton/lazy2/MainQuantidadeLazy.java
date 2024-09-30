package lazySingleton.lazy2;

public class MainQuantidadeLazy {
    public static void main(String[] args) {

        CenarioLazy quantidadeLazy = new CenarioLazy();
        CenarioLazy quantidadeLazy2 = new CenarioLazy();
        CenarioLazy quantidadeLazy3 = new CenarioLazy();
        CenarioLazy quantidadeLazy4 = new CenarioLazy();

        quantidadeLazy.run();
        quantidadeLazy2.run();
        quantidadeLazy3.run();
        quantidadeLazy4.run();//vai criar a mesma instancia de cima, mesmo hashcode

    }
}
