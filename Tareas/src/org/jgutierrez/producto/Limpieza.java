package org.jgutierrez.producto;

public class Limpieza extends Producto{
    private String componentes;
    private Double litros;

    public Limpieza(String nombre, Double precio, String componentes, Double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Limpieza{" +
                "componentes='" + componentes + '\'' +
                ", litros=" + litros +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
