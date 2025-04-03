/**
 * Clase motocicleta donde se van a almacenar todos los Vehículos de tipo Vehículo.
 * @version 31/03/2025
 * @author Jessy
 */
public class Motocicleta extends Vehiculo {
    String tipo;

    /**
     * Constructor principal de la clase.
     * @param matricula de la motocicleta.
     * @param marca de la motocicleta.
     * @param modelo de la motocicleta.
     * @param anio de la motocicleta.
     * @param tipo de la motocicleta.
     */
    public Motocicleta(String matricula, String marca, String modelo, int anio, String tipo) {
        super(matricula, marca, modelo, anio);
        this.tipo = tipo;
    }

    /**
     * Método para activar el modo de aceleración rápida para la motocicleta.
     */
    public void hacerAceleracionRapida(){
        System.out.println("Haciendo aceleración rápida.");
    }

    /**
     * Método que hereda de la clase Vehículo para mostrar la información de la motocicleta.
     * @return información de la motocicleta.
     */
    @Override
    public String mostrarInfo() {
        return super.mostrarInfo();
    }
}
