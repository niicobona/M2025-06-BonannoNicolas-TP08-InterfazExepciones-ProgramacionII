
package pasaportefototitular;


public class PasaporteFotoTitular {

 
    public static void main(String[] args) {
        Titular t = new Titular("Nicolas Bonanno","36616261");
        Pasaporte p = new Pasaporte("123431562","03-06-2015","imagenRostro","JPG",t);
        
        p.setTitular(t);
        
        System.out.println(p);
        System.out.println(t);
        System.out.println(p.getFoto());
          
        
    }
    
}
