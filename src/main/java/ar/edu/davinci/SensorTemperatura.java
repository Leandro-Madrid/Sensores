package ar.edu.davinci;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura {
    private List<Usuario> observadores = new ArrayList<>();
    private double temperaturaActual;

    public void agregarObservador(Usuario observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Usuario observador) {
        observadores.remove(observador);
    }

    public void establecerTemperatura(double temperatura) {
        this.temperaturaActual = temperatura;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Usuario observador : observadores) {
            observador.actualizar(temperaturaActual);
        }
    }

    public double obtenerTemperaturaActual() {
        return temperaturaActual;
    }
}


