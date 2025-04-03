/**
 * Clase Vehículo donde estarán almacenadas todas las características de los vehículos.
 * @version 31/03/2025
 * @author Jessy
 */
public class Vehiculo {
    String matricula;
    String marca;
    String modelo;
    int anio;

    /**
     * Constructor principal de la clase.
     * @param matricula del vehículo.
     * @param marca del vehículo.
     * @param modelo del vehículo.
     * @param anio del vehículo.
     */
    public Vehiculo(String matricula, String marca, String modelo, int anio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    /**
     * Método donde mostraremos la información de los vehículos.
     * @return información de cada vehículo.
     */
    public String mostrarInfo(){
        return ("El vehículo con matrícula " + matricula + " es de la marca " + marca + " con el modelo " + modelo + " del año " + anio);
    }
}
