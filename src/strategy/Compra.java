package strategy;

public class Compra {

    private String nomeProduto;
    private double valorCompra;
    private double valorDesconto;

    public Compra(String nomeProduto, double valorCompra) {
        this.nomeProduto = nomeProduto;
        this.valorCompra = valorCompra;
    }

    public static double valorDesconto(Compra compra, String tipo) {
        Desconto desconto;
        if (tipo.equals("ValorFixo")) {
            desconto = new DescontoFixo();
            return desconto.desconto(compra);
        } else if (tipo.equals("ValorMinimo")) {
            desconto = new DescontoMinimo();
            return desconto.desconto(compra);
        } else if (tipo.equals("ValorPercentual")) {
            desconto = new DescontoPercentual();
            return desconto.desconto(compra);
        } else {
            throw new IllegalArgumentException("Tipo inválido!");
        }

    }

    @Override
    public String toString() {
        return "Compra{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", valorCompra=" + valorCompra +
                ", valorDesconto=" + valorDesconto +
                '}';
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
