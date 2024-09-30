package strategy;

public class DescontoFixo implements Desconto{

    @Override
    public double desconto(Compra compra) {
       return compra.getValorCompra()-10.0;
    }
}
