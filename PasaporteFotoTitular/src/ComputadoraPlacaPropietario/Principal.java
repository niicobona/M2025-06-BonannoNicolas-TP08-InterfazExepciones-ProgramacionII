
package ComputadoraPlacaPropietario;


public class Principal {
        public static void main(String[] args) {
        PlacaMadre pm = new PlacaMadre("Razer Prime", "B450");
        Computadora compu = new Computadora("MSI", "M-12345", pm);
        Propietario p = new Propietario("Nicolas Bonanno", "36616261");

        compu.setPropietario(p); 

        System.out.println(pm);
        System.out.println(p);
        System.out.println(compu);
    }
}
