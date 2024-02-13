package org.jgutierrez.producto;

public class Lacteo extends Producto{
    private int cantidad;
    private int proteinas;

    public Lacteo(String nombre, Double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad=cantidad;
        this.proteinas=proteinas;
    }

    @Override
    public String toString() {
        return "Lacteo{" +
                "cantidad=" + cantidad +
                ", proteinas=" + proteinas +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
