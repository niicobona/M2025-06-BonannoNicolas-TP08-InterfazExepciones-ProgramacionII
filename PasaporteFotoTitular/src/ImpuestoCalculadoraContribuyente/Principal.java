
package ImpuestoCalculadoraContribuyente;


public class Principal {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Nicolas Bonanno", "20-12345678-9");
        Impuesto i = new Impuesto(15000.0, c);

        Calculadora calc = new Calculadora();
        calc.calcular(i);

        System.out.println(c);
        System.out.println(i);
        
    }
}
