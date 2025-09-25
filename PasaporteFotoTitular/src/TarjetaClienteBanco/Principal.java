
package TarjetaClienteBanco;


public class Principal {
   
        public static void main(String[] args) {
            
        Banco b = new Banco("Banco Santander", "30-12345678-9");
        Cliente c = new Cliente("Nicolas Bonanno", "36616261");
        TarjetaDeCredito t = new TarjetaDeCredito("1234-5678-9876-5432", "12/2028");

        t.setBanco(b);   
        t.setCliente(c); 

        System.out.println(b);
        System.out.println(c);
        System.out.println(t);
    }
    
}
