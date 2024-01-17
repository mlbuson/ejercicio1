package tarjetas;

import tarjetas.TarjetaTasaStrategy;

public class VisaTasaStrategy implements TarjetaTasaStrategy {
    @Override
    public double calcularTasa(double importe) {
        return (2024.0 / 12);
    }
}
