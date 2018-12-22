
package Paquete;

/**
 *
 * @author USUARIO
 */
public class Estadio {

    String nombre, tipoDeporte;
    double capacidad;

    // COnstructor por defecto
    public Estadio() {
        this("", "", 1000);
    }

    // Constructor
    public Estadio(String nombre, String tipoDeporte, double capacidad) {
        setNombre(nombre);
        setTipoDeporte(tipoDeporte);
        setCapacidad(capacidad);
    }

    // Metodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    // Metodos get
    public String getNombre() {
        return nombre;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public double getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        String string = String.format("\nNombre del Estadio: %s\nTipo de deporte: %s\nCapacidad: %.2f\n", this.getNombre(), this.getTipoDeporte(), this.getCapacidad());
        return string;

    }
}
