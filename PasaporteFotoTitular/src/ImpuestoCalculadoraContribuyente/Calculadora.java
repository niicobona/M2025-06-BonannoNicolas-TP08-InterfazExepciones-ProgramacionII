
package ImpuestoCalculadoraContribuyente;


public class Calculadora {
    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            System.out.println("Calculando impuesto para " +
                    impuesto.getContribuyente().getNombre() +
                    " | Monto: " + impuesto.getMonto());
        } else {
            System.out.println("No hay impuesto para calcular.");
        }
    }

    @Override
    public String toString() {
        return "Calculadora{}";
    }
}
