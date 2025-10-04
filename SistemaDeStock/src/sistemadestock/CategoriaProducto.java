
package sistemadestock;


public enum CategoriaProducto {
   ALIMENTOS("Productos Comestibles"),
   ELECTRONICA("Dispositivos Electronicos"),
   ROPA("Prendas de Vestir"),
  HOGAR("Articulos del Hogar");
    
    private final String descripcion;
    
    private CategoriaProducto(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
}
