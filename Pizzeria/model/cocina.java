package model;

public class cocina {
    orden orden;
    pizza pizza;
    int pago;

    // Corrección: Constructor ahora tiene el mismo nombre de la clase
    public cocina(orden orden, pizza pizza, int pago) {
        this.orden = orden;
        this.pizza = pizza;
        this.pago = pago;
    }

    public orden getOrden() {
        return orden;
    }

    public void setOrden(orden orden) {
        this.orden = orden;
    }

    public pizza getPizza() {
        return pizza;
    }

    public void setPizza(pizza pizza) {
        this.pizza = pizza;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
}

