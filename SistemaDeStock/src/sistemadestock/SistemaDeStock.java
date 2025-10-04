
package sistemadestock;

import java.util.Arrays;


public class SistemaDeStock {

   
    public static void main(String[] args) {
        
        //CREANDO INVENTARIO
        Inventario i = new Inventario();
        
        // CREANDO PRODUCTOS
         Producto p1 = new Producto("AL123", "Leche", 1500.0, 6, CategoriaProducto.ALIMENTOS);
         Producto p2 = new Producto("HO22", "Lampara", 20000.0, 1, CategoriaProducto.HOGAR);
         Producto p3 = new Producto("EL23", "Licuadora", 40000.0, 1, CategoriaProducto.ELECTRONICA);
         Producto p4 = new Producto("EL22", "Tostadora", 25000.0, 1, CategoriaProducto.ELECTRONICA);
         Producto p5 = new Producto("RO5", "Remera", 15000.0, 3, CategoriaProducto.ROPA);
         Producto p6 = new Producto("RO7", "Pantalon Joggin", 18000.0, 2, CategoriaProducto.ROPA);
         Producto p7 = new Producto("AL234", "Arroz", 1200.0, 4, CategoriaProducto.ALIMENTOS);
            
        //AGREGAR PRODUCTOS A INVENTARIO.
        i.agregarProducto(p1);
        i.agregarProducto(p2);
        i.agregarProducto(p3);
        i.agregarProducto(p4);
        i.agregarProducto(p5);
        i.agregarProducto(p6);
        i.agregarProducto(p7);
        
        // LISTAR PRODUCTOS.
        System.out.println("------ Listar Productos ------");
        i.listarProductos();
        
       //BUSCAR PRODUCTO POR ID.
        System.out.println("------ Buscar Producto ------");
       i.buscarProductoPorId("AL123").mostrarInfo();
       i.buscarProductoPorId("AL1234");
       
        //FILTRAR POR CATEGORIA.
        System.out.println("------ Filtrar Por Categoria ------");
        i.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
     
        //ELIMINAR PRODUCTO POR ID.
        System.out.println("------ Listar Productos luego de eliminar ------");
        i.eliminarProducto("EL22");
        i.eliminarProducto("EL23");
        i.listarProductos();
        
        //ACTUALIZAR STOCK.
        i.actualizarStock("RO5", 5);
        p5.mostrarInfo();
        
        //OBTENER EL STOCK TOTAL DE LOS PRODUCTOS.
        System.out.println("------ Stock Total ------");
        System.out.println("El stock total de los productos es: " + i.obtenerTotalStock());
        
        //PRODUCTO CON MAYOR STOCK.
        System.out.println("------ Propductos con mayor Stock ------");
         System.out.println(i.obtenerProductoConMayorStock().toString());

         //FILTRAR PRODUCTOS (MIN,MAX)
         System.out.println("------ Filtrar Productos Min/Max ------");
         System.out.println(i.filtrarProductosPorPrecio(1000.0, 3000.0).toString());
         
         //MOSTRAR CATEGORIAS
         System.out.println("------ Categorias y Descripciones ------");
         i.mostrarCategoriasDisponibles();
         
         
    }

}
