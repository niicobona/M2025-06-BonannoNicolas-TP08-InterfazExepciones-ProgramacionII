
package ReservaMesaCliente;


public class Principal {
    
      public static void main(String[] args) {
        Cliente c = new Cliente("Nicolas Bonanno", "1122334455");
        Mesa m = new Mesa(5, 4);

        Reserva r = new Reserva("2025-10-01", "20:30", c, m);

        System.out.println(c);
        System.out.println(m);
        System.out.println(r);
    }
}
