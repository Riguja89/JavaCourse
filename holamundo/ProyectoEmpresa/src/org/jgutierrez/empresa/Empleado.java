package org.jgutierrez.empresa;

public class Empleado extends Persona {
    private Double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){

    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "remuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId +
                '}';
    }
}
