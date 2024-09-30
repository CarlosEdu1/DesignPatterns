package strategy;

public class DescontoPercentual implements Desconto{

    @Override
    public double desconto(Compra compra) {

        return compra.getValorCompra()*0.95;
    }
}
