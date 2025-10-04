
package sistemadestock;

public class Producto {
    private String ID;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoriaProducto;

    public Producto(String ID, String nombre, double precio, int cantidad, CategoriaProducto categoriaProducto) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoriaProducto = categoriaProducto;
    }

    public String getID() {return ID;}
    public String getNombre() { return nombre;}
    public double getPrecio() {return precio;}
    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) {this.cantidad = cantidad; }
    

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }
    
    
    
    public void mostrarInfo(){
        System.out.println("ID: " + ID +"\nNombre: "+ nombre + "\nPrecio: "+ precio + "\nCantidad: " + cantidad + "\nCategoria: "+ categoriaProducto + "\n--------------------------------------"  );
    }

    @Override
    public String toString() {
        return ("ID: " + ID +"\nNombre: "+ nombre + "\nPrecio: "+ precio + "\nCantidad: " + cantidad + "\nCategoria: "+ categoriaProducto );
    } 
    
}
