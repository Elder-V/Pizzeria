package controller;

import model.orden;
import model.pizza;
import model.cocina;

public class pizzeriacontroller {

    orden orden;

    public model.orden crearPedido(String nombre, int[] arrayOrdenes, pizza pizzaSeleccionada, int pago) {
        orden nuevaOrden = new orden(nombre, pago);

        return nuevaOrden; 
    }

    public void mostrarResumenPedido(cocina pedido) {
        System.out.println("====== RESUMEN DEL PEDIDO ======");
        System.out.println("Cliente: " + pedido.getOrden().getNombre());
        System.out.println("Monto Pagado: $" + pedido.getPago());
        System.out.println("=================================");
    }
}