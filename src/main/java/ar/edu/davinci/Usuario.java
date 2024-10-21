package ar.edu.davinci;

public class Usuario implements Observer {
    private String nombre;
    private UmbralTemperatura umbral;

    public Usuario(String nombre, UmbralTemperatura umbral) {
        this.nombre = nombre;
        this.umbral = umbral;
    }

    @Override
    public void actualizar(double temperatura) {
        if (temperatura < umbral.obtenerMinimo() || temperatura > umbral.obtenerMaximo()) {
            System.out.println("Notificación para " + nombre + ": Temperatura fuera de rango: " + temperatura + "°C");
        }
    }

    public String obtenerNombre() {
        return nombre;
    }
}

