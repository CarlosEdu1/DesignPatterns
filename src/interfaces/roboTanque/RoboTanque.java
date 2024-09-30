package interfaces.roboTanque;

public class RoboTanque implements Posicao, Canhao, Cor {

    private int x;
    private int y;
    private CoresRGB corTanque;
    private CoresRGB corCanhao;


    public RoboTanque() {
    }

    public RoboTanque(int x, int y, CoresRGB corTanque, CoresRGB corCanhao) {
        this.corCanhao = corCanhao;
        this.corTanque = corTanque;
        this.y = y;
        this.x = x;
    }


    @Override
    public void atirar() {
        System.out.println("atirar...");
    }

    private void esperar(long cadencia) {
        try {
            if (cadencia > 5000L) {
                throw new IllegalArgumentException("Valor inválido! ");
            }
            Thread.sleep(cadencia);

        } catch (InterruptedException var4) {
            InterruptedException ex = var4;
            System.out.println("Interrompeu!" + ex.getMessage());
        }
    }

    @Override
    public void atirar(Long cadencia) {
        for (int i = 1; i <= 5; ++i) {//enquanto o i for menor ou igual a 5, continua contando
            System.out.println("Atirar");//mostrar atirar
            this.esperar(cadencia * 1000L);//
        }
    }

    @Override
    public void atribCorTanque(CoresRGB corTanque) {
        this.corCanhao = corCanhao;
    }

    @Override
    public void atribCorCanhao(CoresRGB corTanque) {
        this.corTanque = corTanque;
    }

    @Override
    public CoresRGB retCorTanque() {
        return this.corTanque;
    }

    @Override
    public CoresRGB retCorCanhao() {
        return this.corCanhao;
    }

    @Override
    public void movLeste() {
        ++this.x;
    }

    @Override
    public void movOeste() {
        --this.x;
    }

    @Override
    public void movSul() {
        ++this.y;
    }

    @Override
    public void movNorte() {
        --this.y;
    }

    @Override
    public int retPosX() {
        return this.x;
    }

    @Override
    public int retPosY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "RoboTanque{" +
                "x=" + x +
                ", y=" + y +
                ", corTanque=" + corTanque +
                ", corCanhao=" + corCanhao +
                '}';
    }
}
