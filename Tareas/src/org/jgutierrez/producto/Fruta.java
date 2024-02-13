package org.jgutierrez.producto;

public class Fruta extends Producto {
    private Double peso;
    private String color;

    public Fruta(String nombre, Double precio, Double peso, String color){
        super(nombre, precio);
        this.peso=peso;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "peso=" + peso +
                ", color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
