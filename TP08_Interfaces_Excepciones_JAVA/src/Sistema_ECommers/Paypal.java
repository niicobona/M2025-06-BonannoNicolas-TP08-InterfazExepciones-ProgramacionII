
package Sistema_ECommers;


public class Paypal implements PagoConDescuento{
        private String emailCuenta;
        private final double comision = 0.05;
        private double saldoDisponible;
        
    public Paypal(String emailCuenta, double saldoDisponible) {
        this.emailCuenta = emailCuenta;
        this.saldoDisponible = saldoDisponible;
    }

    private boolean tieneFondos(double monto) {
        return saldoDisponible >= monto;
    }

    @Override
    public boolean procesarPago(double monto) {
        double totalConComision = monto * (1 + comision);

        if (!tieneFondos(totalConComision)) {
            System.out.println("Cuenta de: " + emailCuenta + ": Fondos insuficientes para procesar el pago.");
            return false; 
        }
        
        saldoDisponible -= totalConComision;
        System.out.println("Cuenta de " + emailCuenta + ": Se ha procesado el pago correctamente. (saldo restante " + saldoDisponible +")");
        return true;
    }
    

}
