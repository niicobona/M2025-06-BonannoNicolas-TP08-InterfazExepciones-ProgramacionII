
package CelularBateriaUsuario;


public class Principal {
    public static void main(String[] args) {
        Bateria b = new Bateria("SamsungS24", "3000mAh");
        Celular c = new Celular("123456789012345", "Samsung", "Galaxy s24");
        Usuario u = new Usuario("Nicolas Bonanno", "36616261");
        
        c.setUsuario(u);
       
        System.out.println(b);
        System.out.println(u);
        System.out.println(c);
       
    }
     
    
}
