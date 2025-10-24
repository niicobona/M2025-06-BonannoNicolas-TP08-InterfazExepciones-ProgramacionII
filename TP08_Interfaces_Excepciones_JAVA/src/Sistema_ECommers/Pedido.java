
package Sistema_ECommers;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Pedido implements Pagable {
         List<Producto> productos = new ArrayList<>();
         private estadoPedido estado = estadoPedido.CREADO;
          private Notificable cliente;
          
          public Pedido(){}
          public Pedido(Notificable cliente) { this.cliente = cliente;}

         public void setCliente(Notificable cliente) {this.cliente = cliente;}
         public void agregarProducto (Producto p ){productos.add(p); }
         public List<Producto> getProductos() { return Collections.unmodifiableList(productos); }
         public estadoPedido getEstado() { return estado;}
         
         public boolean pagarCon(PagoConDescuento tipoDePago, double porcentajeDesc) {
             
                double total = calcularTotal();
                double conDescuento = tipoDePago.aplicarDescuento(total, porcentajeDesc);
                boolean ok = tipoDePago.procesarPago(conDescuento);
                 if (ok) {
                          this.estado = estadoPedido.PAGADO;
                         System.out.println("Pedido PAGADO");
                         this.estado = estadoPedido.ENVIADO;   
                         if (cliente != null) cliente.notCambio("El pedido cambio a: ENVIADO");
                   
                    }
                 return ok;
         }
         
         
         
         public void cambiarEstado(estadoPedido nuevo){
             this.estado = nuevo;
              if (cliente != null) cliente.notCambio("El pedido cambio a estado: " + nuevo);
         }
    
         @Override
         public double calcularTotal(){       
                double precioTotalPedidos = 0;
                 for (Producto p : productos) {
                  precioTotalPedidos += p.getPrecio();
             }
                 return precioTotalPedidos;
         }
         public void mostrarPedido(){
             for (Producto producto : productos) {
                 System.out.println(producto);
                  }
         }
        
       
    
}
