import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Clase donde se van a guardar los registros de todos los vehículos.
 * @version 31/03/2025
 *  @author Jessy
 */
public class RegistroVehicular{
    HashMap<Propietario, Vehiculo> vehiculos;

    /**
     * Constructor general de la clase.
     * @param vehiculos lista de vehículos almacenados.
     */
    public RegistroVehicular(List<Vehiculo> vehiculos) {
        vehiculos = new ArrayList<>();
    }

    /**
     * Método que devuelve la lista de los vehículos.
     * @return Lista de vehículos.
     */
    public HashMap<Propietario, Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Método para establecer la lista de vehículos
     * @param vehiculos Lista de vehículos a almacenar
     */
    public void setVehiculos(HashMap<Propietario,Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Método para buscar un vehículo mediante el dni de su propietario.
     * @param dni del propietario del vehículo.
     * @return El vehículo que corresponde al dni proporcionado, o null si no se encuentra.
     */
    public Vehiculo buscarVehiculo(String dni){
        for (Propietario p : vehiculos.keySet()) {
            if (p.getDni().equals(dni)) {
                // Si coincide, devolvemos el vehículo
                return vehiculos.get(p);
            }
        }
        return null;
    }

    /**
     * Método donde mostraremos la información de los vehículos.
     * @return información del vehículo.
     */
    @Override
    public String toString() {
        return "RegistroVehicular{" +
                "vehiculos=" + vehiculos +
                '}';
    }
}
