public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1=new OrdenCompra("esta es la primer orden de compra");
        orden1.setCliente(new Cliente("Juanito", "Perez"));
        orden1.addProducto(new Producto("Rimax","silla", 200000));
        orden1.addProducto(new Producto("Samsung","celular S20", 1800000));
        orden1.addProducto(new Producto("Lenovo","Computador Ideapad", 2500000));
        orden1.addProducto(new Producto("Microsoft","Teclado Ergonomico", 400000));

        OrdenCompra orden2=new OrdenCompra("esta es la segunda orden de compra");
        orden2.setCliente(new Cliente("Lupita", "Gutierrez"));
        orden2.addProducto(new Producto("Home","Lampara", 50000));
        orden2.addProducto(new Producto("Samsung","Cargador S20", 60000));
        orden2.addProducto(new Producto("Lenovo","pantalla PC", 1000000));
        orden2.addProducto(new Producto("Genius","Teclado", 100000));

        OrdenCompra orden3=new OrdenCompra("esta es la tercer orden de compra");
        orden3.setCliente(new Cliente("Lida", "Chaparro"));
        orden3.addProducto(new Producto("Croydon","Zapatos", 150000));
        orden3.addProducto(new Producto("Samsung","Televisor 50'", 1800000));
        orden3.addProducto(new Producto("Immusa","Olla a presión", 70000));
        orden3.addProducto(new Producto("Kalley","Bafle de sonido con bluetooth", 700000));



        System.out.println("orden1 = " + orden1.toString());
        System.out.println("orden2 = " + orden2.toString());
        System.out.println("orden3 = " + orden3.toString());
    }
}
