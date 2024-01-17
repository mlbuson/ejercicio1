package tarjetas;

import tarjetas.TarjetaTasaStrategy;

public class AmexTasaStrategy implements TarjetaTasaStrategy {
    @Override
    public double calcularTasa(double importe) {
        return (9 * 0.1);
    }
}
