import java.time.LocalDate;

/**
 * Clase mantenimiento donde se almacenará el mantenimiento de los vehículos con toda su información necesaria.
 * @version 31/03/2025
 * @author Jessy
 */
public class Mantenimiento {
    LocalDate fecha;
    String tipoServicio;
    double costo;

    /**
     * Constructor principal de la clase
     * @param fecha en la cual se llevó a cabo el mantenimiento.
     * @param tipoServicio tipo de servicio que recibió el vehículo.
     * @param costo precio final del mantenimiento.
     */
    public Mantenimiento(LocalDate fecha, String tipoServicio, double costo) {
        this.fecha = fecha;
        this.tipoServicio = tipoServicio;
        this.costo = costo;
    }

    /**
     * Método para mostrar los detalles del servicio de cada vehículo.
     * @return información sobre el detalle de los servicios.
     */
    public String detalleServicio(){
        return ("Mostrando detalles del servicio...");
    }

    /**
     * Método que devuelve la fecha del servicio
     * @return fecha del servicio.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Método para almacenar la fecha de la revisión.
     * @param fecha en la que se hizo el mantenimiento.
     * @throws IllegalArgumentException si da error al ser la fecha anterior al momento actual.
     */
    public void setFecha(LocalDate fecha) throws IllegalArgumentException{
        if (fecha.isBefore(LocalDate.now())){
            this.fecha = fecha;
        } else {
            throw new IllegalArgumentException("La fecha de mantenimiento debe de ser anterior al momento actual.");
        }
    }

    /**
     * Método que devuelve el tipo de servicio.
     * @return tipo de servicio que se ha realizado.
     */
    public String getTipoServicio() {
        return tipoServicio;
    }

    /**
     * Método para almacenar el tipo de servico.
     * @param tipoServicio tipo de servicio a almacenar.
     */
    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    /**
     * Método que devuelve el precio del servicio.
     * @return precio del servicio.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Mñetodo para almacenar el precio del mantenimiento.
     * @param costo precio del mantenimiento a almacenar.
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }


    /**
     * Método donde mostraremos la información de los mantenimientos.
     * @return información del mantenimiento de cada vehículo.
     */
    @Override
    public String toString() {
        return "Mantenimiento{" +
                "fecha=" + fecha +
                ", tipoServicio='" + tipoServicio + '\'' +
                ", costo=" + costo +
                '}';
    }
}
