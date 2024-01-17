package tarjetas;

import tarjetas.TarjetaTasaStrategy;

public class NaraTasaStrategy implements TarjetaTasaStrategy {
    @Override
    public double calcularTasa(double importe) {
        return (27 * 0.5);
    }
}
