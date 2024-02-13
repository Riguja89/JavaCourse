package org.jgutierrez.ejemplo;

import org.jgutierrez.producto.*;

public class EjemploProducto {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];

        productos[0] = new Lacteo("Leche", 3000.0, 2, 400);
        productos[1] = new Fruta("Papaya", 1500.0, 2500.0, "naranja");
        productos[2] = new Limpieza("cloro", 2500.0, "cloro y agua", 0.5);
        productos[3] = new NoPerecible("Frijol", 4500.0, 2, 500);
        productos[4] = new Lacteo("Yogurt", 3000.0, 2, 400);
        productos[5] = new Fruta("Naranja", 1500.0, 2500.0, "naranja");
        productos[6] = new Limpieza("Cloro en Gel", 2500.0, "cloro y agua", 0.5);
        productos[7] = new NoPerecible("Arveja", 4500.0, 2, 500);

        for (Producto producto : productos
        ) {
            System.out.println(producto);
        }
    }
}
