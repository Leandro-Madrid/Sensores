package ar.edu.davinci;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura implements Observable {
    private List<Observer> observadores = new ArrayList<>();
    private double temperaturaActual;

    @Override
    public void agregarObservador(Observer observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.actualizar(temperaturaActual);
        }
    }

    public void establecerTemperatura(double temperatura) {
        this.temperaturaActual = temperatura;
        notificarObservadores();
    }

    public double obtenerTemperaturaActual() {
        return temperaturaActual;
    }
}


