
package sistemadestock;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Inventario {
  List <Producto> productos =new ArrayList<>();

    public Inventario() {
      
    }

    public List<Producto> getProductos() {
         return Collections.unmodifiableList(productos);
    }
  
   
  
    
public void agregarProducto(Producto p){
    if (p == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
    productos.add(p);
}


public void listarProductos(){
    for (Producto p : productos){
        p.mostrarInfo();
    }
}


public Producto buscarProductoPorId(String id ){
        int i = 0;
        Producto productoID = null;
        while (i < productos.size() && !this.productos.get(i).getID().equals(id)) {
            i++;
        }
        if (i < productos.size()) {
            productoID = this.productos.get(i);
            return productoID;
        } 
        System.out.println("El producto con ese ID no existe en el inventario.");
        return productoID;
}


 public void eliminarProducto(String id){
     
     Producto productoID = buscarProductoPorId(id);
        if (productoID != null) {
            productos.remove(productoID);
            System.out.println("Producto eliminado correctamente.");
    } else {
        System.out.println("No se encontró un producto con el ID: " + id);
    }
}
 
 
public boolean actualizarStock(String id, int nuevaCantidad){
    Producto productoID = buscarProductoPorId(id);
    if (productoID != null && nuevaCantidad >= 0 ) {
        productoID.setCantidad(nuevaCantidad);
        System.out.println("Stock actualizado.");
        return true;
    }
    return false;
}


public void filtrarPorCategoria(CategoriaProducto categoria){
    boolean encontrado = false;
    for(Producto p : productos){
        if (p.getCategoriaProducto().equals(categoria)){
           p.mostrarInfo();
           encontrado = true;
        }
    }
     if (!encontrado) {
        System.out.println("No hay productos en la categorIa " + categoria);
    }
    
}


public int obtenerTotalStock(){
    int totalStock = 0;
    for (Producto p : productos){
        totalStock += p.getCantidad();
    }
    return totalStock;
}


public Producto obtenerProductoConMayorStock(){
    Producto productoMayorStock = null;
    int stock = 0;
    for (Producto p : productos){
        if(p.getCantidad() > stock){
            stock = p.getCantidad();
            productoMayorStock = p;
        }
    }
    return productoMayorStock;
}


public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
   ArrayList<Producto> productosFiltrados = new ArrayList<>();
    for (Producto p : productos){
        if (p.getPrecio() > min && p.getPrecio() < max){
            productosFiltrados.add(p);
        }
    }
    return productosFiltrados;
}


public void mostrarCategoriasDisponibles(){
    CategoriaProducto[ ] categorias = CategoriaProducto.values();
      for (CategoriaProducto cat : categorias){
          System.out.println(cat + ": " + cat.getDescripcion());
    }
}

    @Override
    public String toString() {
        return "Inventario{" + "productos=" + productos + '}';
    }
   

}
