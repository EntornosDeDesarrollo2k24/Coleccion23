/**
 * Clase automóvil donde vamos a almacenar todos los Vehículos de tipo Automóvil.
 * @version 31/03/2025
 * @author Jessy
 */
public class Automovil extends Vehiculo {
    int numPuertas;

    /**
     * Constructor principal de la clase.
     * @param matricula del automóvil.
     * @param marca del automóvil.
     * @param modelo del automóvil.
     * @param anio del automóvil.
     * @param numPuertas del automóvil.
     */
    public Automovil(String matricula, String marca, String modelo, int anio, int numPuertas) {
        super(matricula, marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    /**
     * Método para indicar que se ha abierto el maletero del automóvil.
     */
    public void abrirMaletero(){
        System.out.println("Se ha abierto el maletero");
    }

    /**
     * Método que hereda de la clase Vehículo para mostrar la información del automóvil.
     * @return información del automóvil.
     */
    @Override
    public String mostrarInfo() {
        return super.mostrarInfo();
    }
}
