
package CuentaBancariaTitularClave;


public class Principal {
    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("XYZ123", "2025-09-25");
        CuentaBancaria cuenta = new CuentaBancaria("000123456789", 15000.0, clave);
        Titular titular = new Titular("Nicolas Bonanno", "36616261");

        cuenta.setTitular(titular);

        System.out.println(clave);
        System.out.println(titular);
        System.out.println(cuenta);
    }
}
