
package UniversidadCursoProfesor;


public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesores;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;    
    }

    public String getCodigo() { return codigo;}
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesores; }
    public void setProfesor(Profesor profesor) { 
        if( this.profesores == profesor) {
        return;
        } 
        if (this.profesores != null){
            this.profesores.eliminarCurso(this);
        }
        this.profesores = profesor;
        if(this.profesores != null && !profesor.getCursos().contains(this)){
            profesor.agregarCurso(this);
        }
    }
    
    public void mostrarInfo(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        String nomProf = (profesores != null) ? profesores.getNombre() : "Sin asignar";
        return "Curso[" + codigo + " - " + nombre + "] | Profesor: " + nomProf;
    }
    
}
