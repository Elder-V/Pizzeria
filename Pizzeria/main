import controller.pizzeriacontroller;
import model.pizza;
import model.cocina;

public class main {

    public static void main(String[] args) {
        pizzeriacontroller controller = new pizzeriacontroller();

        String nombreCliente = "Carlos Perez";
        int[] ordentotales = {1, 2, 3};
        int pago = 150;

        pizza pizzaPedido = new pizza(); 

        cocina pedidoRealizado = controller.crearPedido(nombreCliente, ordentotales, pizzaPedido, pago);

        System.out.println("¡Pedido registrado exitosamente!");
        controller.mostrarResumenPedido(pedidoRealizado);
    }
}