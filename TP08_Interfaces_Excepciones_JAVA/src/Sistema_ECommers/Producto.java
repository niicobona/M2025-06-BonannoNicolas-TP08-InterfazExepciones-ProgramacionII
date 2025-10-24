
package Sistema_ECommers;


public  class Producto implements Pagable{
    
        private String nombre;
        private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

        
    public String getNombre() { return nombre; }
    public double getPrecio() {return precio; }
    

    @Override
    public double calcularTotal() {
            double total = 0;
            return total;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre= " + nombre + ", precio= " + precio + '}';
    }
    
    

        
        
}
