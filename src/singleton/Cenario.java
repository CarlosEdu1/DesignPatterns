package singleton;

// Escreva um método configuracoes que
// deve exibir uma mensagem. Esse método deve ser
// invocado pela instância dentro da classe Cenario.

public class Cenario {


    private static Cenario cenario = null;//atributo privado e statico

    private Cenario() { //construtor privado
    }

    public static Cenario getCenario() { //metodo publico e estatico
        if (cenario == null)
            cenario = new Cenario();
        cenario.configuracoes();
        return cenario;
    }

    public void configuracoes() {
        System.out.println("Mensagem");
    }

}
