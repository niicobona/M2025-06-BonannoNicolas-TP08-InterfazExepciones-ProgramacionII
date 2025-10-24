
package Sistema_ECommers;


public class TarjetaDeCredito  implements PagoConDescuento{
    
    private String titular;
    private final  double comision = 0.03;
    private double saldoDisponible;

    public TarjetaDeCredito( String titular, double saldoDisponible) {
        this.titular = titular;
        this.saldoDisponible = saldoDisponible;
    }
    
    private boolean tieneFondos(double monto) {
        return saldoDisponible >= monto;
    }

    @Override
    public boolean procesarPago(double monto) {
    
         double totalConComision = monto * (1 + comision);

        if (!tieneFondos(totalConComision)) {
            System.out.println("Tarjeta de " + titular + ": Fondos insuficientes para procesar el pago.");
            return false; 
        }
        
        saldoDisponible -= totalConComision;
        System.out.println("Tarjeta de " + titular + ": Se ha  procesado el pago correctamente. (saldo restante " + saldoDisponible +")");
        return true;
    }
    
    
    
}
