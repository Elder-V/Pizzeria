package model;
import java.util.Date;

public class orden {
    String nombre;
    int pago;
    Date fecha;
    int ordentotales[] = new int[3];

    public orden(String nombre, int pago){ //metodo cambiado de "usuario" a "orden"
        this.nombre = nombre;
        this.pago = pago;
    } 

    public orden(String nombre, int pago, Date fecha){ 
        this.nombre = nombre;
        this.pago = pago;
        this.fecha = fecha;
    } 

    public orden(int ordentotales[]){ 
        this.ordentotales = ordentotales;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int[] getOrdentotales() {
        return ordentotales;
    }

    public void setOrdentotales(int[] ordentotales) {
        this.ordentotales = ordentotales;
    }
}

