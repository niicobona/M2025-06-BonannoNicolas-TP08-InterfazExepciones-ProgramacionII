
package UniversidadCursoProfesor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Universidad {
    private String nombre;
    List <Curso> cursos = new ArrayList<>();
    List <Profesor> profesores = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void agregarProfesor(Profesor p){
        if ( p != null && !profesores.contains(p)){
          profesores.add(p);
        }
    }
    
    public void agregarCurso(Curso c){
        if ( c != null && !cursos.contains(c)){
          cursos.add(c);
        }
        
    }
    
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor){
        int i = 0; 
        while (i < profesores.size() && !this.profesores.get(i).getId().equals(idProfesor)) {
            i++;
        }
        if (i == profesores.size()) return false;
         Profesor profId = this.profesores.get(i);     
        
        int j = 0;
         while (j < cursos.size() && !this.cursos.get(j).getCodigo().equals(codigoCurso)) {
            j++;
        }
         if(j == cursos.size()) return false;
         Curso curso = cursos.get(j);
         
        profId.agregarCurso(curso);
        return true;     
        }
        
    
   public void listarProfesores(){
            for(Profesor p : profesores){
                p.mostrarInfo();
            }
        }
   
   
   public void listarCursos(){
            for(Curso c : cursos){
                c.mostrarInfo();
            }
        }
   
   public Profesor buscarProfesorPorId(String id){
         int i = 0; 
         Profesor profId = null;
        while (i < profesores.size() && !this.profesores.get(i).getId().equals(id)) {
            i++;
        }
         if (i < profesores.size()){
              profId = this.profesores.get(i);  
        }
            return profId;
        }
   
   public Curso buscarCursoPorCodigo(String codigo){
       int i = 0; 
         Curso cursoCod = null;
        while (i < cursos.size() && !this.cursos.get(i).getCodigo().equals(codigo)) {
            i++;
        }
         if (i < profesores.size()){
              cursoCod = this.cursos.get(i);  
        }
            return cursoCod;
   }
     
 public boolean eliminarCurso(String codigo){
     for (int i = 0; i < cursos.size(); i++) {
         Curso c = cursos.get(i);
         if (c != null && Objects.equals(c.getCodigo(), codigo)){
           Profesor p = c.getProfesor();        
           if (p != null) {
                p.eliminarCurso(c);                 
            } else {
                c.setProfesor(null);      
            }
            cursos.remove(i);             
            return true;
             }
        }
     return false;
 }
 
 public boolean eliminarProfesor(String id){
     Profesor prof = buscarProfesorPorId(id);
    if (prof == null) return false;
    
    prof.limpiarCurso();
    profesores.remove(prof);
    return true;
 }
 
 public void cursosPorProfesor() {
    for (Profesor p : profesores) {
        System.out.println(p.getNombre() + " (" + p.getId() + "): "
                + p.getCursos().size() + " curso(s)");
    }
}
 
}
