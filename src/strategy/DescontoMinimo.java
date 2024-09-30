package strategy;

public class DescontoMinimo implements Desconto{

    @Override
    public double desconto(Compra compra) {

        double compra1 = compra.getValorCompra();
        double valorComDesconto = compra1*0.90;

        if(compra1>= 500){
            valorComDesconto-=50;
        }

        return valorComDesconto;
    }
}
