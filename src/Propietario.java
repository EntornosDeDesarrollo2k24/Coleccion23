/**
 * Clase donde vamos a almacenar la información de cada propietario de los vehículos.
 * @version 31/03/2025
 * @author Jessy
 */
public class Propietario {
    String nombre;
    String dni;

    /**
     * Constructor principal de la clase.
     * @param nombre del propietario.
     * @param dni del propietario.
     */
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Método para registrar los vehículos de cada propietario.
     */
    public void registrarVehiculo(){
        System.out.println("Se ha registrado correctamente su vehículo.");
    }

    /**
     * Método para devolver el dni del propietario
     * @return dni del propietario.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Método para almacenar el dni del propietario.
     * @param dni del propietario.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
}
