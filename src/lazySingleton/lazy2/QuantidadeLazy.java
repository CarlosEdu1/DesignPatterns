package lazySingleton.lazy2;

import java.util.ArrayList;
import java.util.List;

public class QuantidadeLazy {

    private static List<QuantidadeLazy> singleton = new ArrayList<>();
    private static int contador = 3;

    private QuantidadeLazy() {
    }

    public static QuantidadeLazy getSingleton() {
        if (singleton.size() < contador) {
            QuantidadeLazy singleton1 = new QuantidadeLazy();
            singleton.add(singleton1);
            return singleton1;
        }
        return singleton.get(singleton.size() - 1);
    }
}

