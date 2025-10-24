
package Sistema_ECommers;


public class Principal {

    
    public static void main(String[] args) {
         Cliente c1 = new Cliente("Nicolas", "nico@mail.com");
        Pedido pedido = new Pedido(c1);

        System.out.println("--- Lista de pedidos ---");
        pedido.agregarProducto(new Producto("Teclado", 25000));
        pedido.agregarProducto(new Producto("Mouse", 10000));
        pedido.agregarProducto(new Producto("Parlante", 35000));
        pedido.agregarProducto(new Producto("Monitor", 60000));
        pedido.mostrarPedido();
        System.out.println("----------------------------------------------------------------");
        System.out.println("--- Precio total de pedidos ---");
        System.out.println("Total: " + pedido.calcularTotal());
         System.out.println("----------------------------------------------------------------");

         System.out.println("---Seleccion de pago, descuento y notificacion al cliente---");
         PagoConDescuento tarjeta = new TarjetaDeCredito("Nicolas Bonanno", 100000.0);
         PagoConDescuento paypal  = new Paypal(c1.getEmail(), 150000.0);
        
         pedido.pagarCon(tarjeta, 10.0);
         
         pedido.pagarCon(paypal, 10.0);
         
    
  
        
        
    }
    
}
