package lazySingleton;

public class MainLazySingleton {
    public static void main(String[] args) {


        Cenario cenario = new Cenario();
        Cenario cenario1 = new Cenario();

        cenario1.run();
        cenario.run();
    }

    //problemas com Singleton:
    //Uso excessivo de memoria
    //Tratamento especifico para ambientes multithreads
    //Dificuldade ao utilizar frameworks
}
