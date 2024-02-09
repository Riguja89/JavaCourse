import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private static int ultimoId;
    private int ultimoIdProducto;

    public OrdenCompra() {
        this.identificador = ++ultimoId;
        this.productos = new Producto[4];
        this.fecha = new Date();
    }

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++ultimoId;
        this.productos = new Producto[4];
        this.fecha = new Date();
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        this.productos[ultimoIdProducto++] = producto;
    }

    ;

    public double getGranTotal() {
        int length = this.productos.length;
        double total = 0.0;
        for (Producto producto : this.productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }
        return total;
    }

    ;

    @Override
    public String toString() {

        String productosText = "OrdenCompra{" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", Productos=";
        for (Producto producto : productos) {
            productosText += producto.toString();
        }
        productosText+="Gran Total=" +this.getGranTotal();

        productosText += '}';

        return productosText;
    }
}
