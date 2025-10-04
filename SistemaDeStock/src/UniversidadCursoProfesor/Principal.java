
package UniversidadCursoProfesor;


public class Principal {
    
    public static void main(String[] args) {
    //CREANDO UINIVERSIDAD.
    Universidad uni = new Universidad ("UTN");
    
    //CREANDO PROFESORES.
    Profesor p1 = new Profesor ("AB123", "Pablo Ramirez", "Matematica");
    Profesor p2 = new Profesor ("AB124", "Maria Gonzalez", "Programacion");
    Profesor p3 = new Profesor ("AB125", "Ana Martinez", "Base de datos");
    
    //CREANDO CURSOS.
    Curso c1 = new Curso("MAT101", "Algebra Lineal");
    Curso c2 = new Curso("MAT102", "Calculo Diferencial");
    Curso c3 = new Curso("PRO201", "Programacion I (Java)");
    Curso c4 = new Curso("PRO202", "Estructuras de Datos");
    Curso c5 = new Curso("BD301", "Modelado de Datos y SQL");
    
    //AGREGAR PROFESORES  Y CURSOS.
    uni.agregarProfesor(p1);
    uni.agregarProfesor(p2);
    uni.agregarProfesor(p3);
    uni.agregarCurso(c1);
    uni.agregarCurso(c2);
    uni.agregarCurso(c3);
    uni.agregarCurso(c4);
    uni.agregarCurso(c5);

    //ASIGNAR CURSO A PROFESOR.
    uni.asignarProfesorACurso("PRO202", "AB124");
    uni.asignarProfesorACurso("MAT101", "AB123");
    uni.asignarProfesorACurso("MAT102", "AB123");
    uni.asignarProfesorACurso("PRO201", "AB124");
    uni.asignarProfesorACurso("BD301", "AB125");
    
    
    //LISTAR PROFESORES Y CURSOS.
    System.out.println("-------- Listar Profesores y Cursos --------");
    uni.listarProfesores();
    uni.listarCursos();
    
    
    //CAMBIAR EL PROFESOR DE UN CURSO. (PODEMOS VER COMO SE LE ASIGNA UN CURSO MAS AL PROF DE PROGRAMACION Y EL DE BASE DE DATOS QUEDA EN 0 CURSOS) 
    System.out.println("");
    System.out.println("-------- Cambiar el  Profesor de un  Curso --------");
    uni.asignarProfesorACurso("BD301", "AB124");
    uni.listarProfesores();
    uni.listarCursos();
    
    
    //REMOVER CURSO Y COMPROBAR EXISTENCIA EN LA LISTA DE PROFESORES. (ELIMINAMOS EL CURSO DE ALGEBRA LINEAL)
    System.out.println("");
    System.out.println("-------- Remover curso y comprobar --------");
    uni.eliminarCurso("MAT101");     
    uni.listarProfesores();
    uni.listarCursos();
   
    //REMOVER PROFESOR Y DEJAR EN NULL.
    System.out.println("");
    System.out.println("-------- Remover Profesor --------");
   System.out.println(uni.eliminarProfesor("AB124"));
    uni.listarCursos();
    uni.listarProfesores();
    
    
    //CANTIDAD DE CURSOS POR PROFESOR.
    System.out.println("");
    System.out.println("-------- Cantidad de cursos por  Profesor --------");
    uni.cursosPorProfesor();
        
 }
}
