package tarjetas;
public class Operacion {
    private double importe;
    private Persona operador;

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Persona getOperador() {
        return operador;
    }

    public void setOperador(Persona operador) {
        this.operador = operador;
    }

    public boolean esOperacionValida() {
        // Implementa la lógica según tus necesidades
        return importe < 1000;
    }
}