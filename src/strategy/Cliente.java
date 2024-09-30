package strategy;

public class Cliente {
    public static void main(String[] args) {

    Compra compra = new Compra("Bisteca",100);
    compra.setValorDesconto(compra.valorDesconto(compra,"ValorMinimo"));
        System.out.println(compra);
    }
}
