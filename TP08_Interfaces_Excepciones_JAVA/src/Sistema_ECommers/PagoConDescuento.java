
package Sistema_ECommers;


public interface PagoConDescuento extends Pago {
   
        default double aplicarDescuento(double monto, double porcentaje) {
                 if (porcentaje < 0) porcentaje = 0;
                 if (porcentaje > 100) porcentaje = 100;
                 return monto * (1 - (porcentaje / 100.0));
    }
        
}
