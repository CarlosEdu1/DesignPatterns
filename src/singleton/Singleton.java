package singleton;

//Quais são as características que o padrão singleton deve ter?
//Que só exista uma instancia da classe e fornece um ponto global de acesso a classe.
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton(){
        return singleton;
    }

}
