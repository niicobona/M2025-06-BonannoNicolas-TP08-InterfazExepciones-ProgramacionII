
package UniversidadCursoProfesor;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List <Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    

    public String getId() { return id;}
    public String getNombre() { return nombre;}
    public String getEspecialidad() { return especialidad; }
    
    
    public void agregarCurso(Curso c){
        if (c == null ){
            throw new IllegalArgumentException("El curso no puede ser nulo");
        }
        if (!cursos.contains(c)){
            cursos.add(c);
        if (c.getProfesor() != this){
            c.setProfesor(this);
        }
    }
    }
    
    
     public void eliminarCurso(Curso c){
        if ( c != null && cursos.contains(c)){
            cursos.remove(c);
            if(c.getProfesor() == this){
                c.setProfesor(null);
            }
        }
    }
     
     public void limpiarCurso(){ 
         for (Curso c : new ArrayList<>(cursos)) {
            eliminarCurso(c);
                }
         
     }

    public List<Curso> getCursos() {
        return  Collections.unmodifiableList(cursos);
    }
     
   
    public void listarCurso(){
        if (cursos.isEmpty()) {
            System.out.println("Sin cursos");
        } else {
            for (Curso c : cursos) {
                System.out.println(c);
        }
    }
    }
    
    public void mostrarInfo(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "Profesor[ID: " + id + ", Nombre: " + nombre + "] (" + especialidad + ") | Cursos: " + cursos.size();
    }
}
