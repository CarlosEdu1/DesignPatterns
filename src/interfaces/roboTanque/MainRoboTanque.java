package interfaces.roboTanque;

public class MainRoboTanque {
    public static void main(String[] args) {

        RoboTanque roboTanque = new RoboTanque(2,4,CoresRGB.BLUE,CoresRGB.RED);
        roboTanque.movLeste();
        roboTanque.movLeste();
        roboTanque.atirar(1L);
        System.out.println(roboTanque);
    }
}
