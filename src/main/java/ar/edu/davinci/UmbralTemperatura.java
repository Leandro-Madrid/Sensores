package ar.edu.davinci;

public class UmbralTemperatura {
    private double minimo;
    private double maximo;

    public UmbralTemperatura(double minimo, double maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public double obtenerMinimo() {
        return minimo;
    }

    public double obtenerMaximo() {
        return maximo;
    }
}

