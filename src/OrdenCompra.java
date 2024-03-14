import java.util.Date;

public class OrdenCompra {

    private int id;
    private String desc;
    private Date fecha;
    private Cliente cliente;
    private String Productos[];
    
    public OrdenCompra(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String[] getProductos() {
        return Productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

}