package tarjetas;

import tarjetas.TarjetaTasaStrategy;

import java.time.LocalDate;

public class TarjetaService {
    private TarjetaTasaStrategy tarjetaTasaStrategy;

    public TarjetaTasaStrategy getTarjetaTasaStrategy() {
        return tarjetaTasaStrategy;
    }

    public void setTarjetaTasaStrategy(TarjetaTasaStrategy tarjetaTasaStrategy) {
        this.tarjetaTasaStrategy = tarjetaTasaStrategy;
    }

    public boolean esTarjetaValida(Tarjeta tarjeta) {
        return tarjeta.getFechaVencimiento().isAfter(LocalDate.now());
    }

    public boolean sonTarjetasDistintas(Tarjeta tarjeta1, Tarjeta tarjeta2) {
        return !tarjeta1.equals(tarjeta2);
    }

    public double obtenerTasaOperacion(String marca, double importe) {
        return tarjetaTasaStrategy.calcularTasa(importe);
    }
}
