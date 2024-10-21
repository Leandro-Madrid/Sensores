package ar.edu.davinci;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();

        UmbralTemperatura umbralUsuario1 = new UmbralTemperatura(15.0, 25.0);
        Usuario usuario1 = new Usuario("Alicia", umbralUsuario1);
        sensor.agregarObservador(usuario1);

        UmbralTemperatura umbralUsuario2 = new UmbralTemperatura(20.0, 30.0);
        Usuario usuario2 = new Usuario("Roberto", umbralUsuario2);
        sensor.agregarObservador(usuario2);

        sensor.establecerTemperatura(22.0);
        sensor.establecerTemperatura(14.0);
        sensor.establecerTemperatura(28.0);
        sensor.establecerTemperatura(26.0);
    }
}