
package CitaPacienteProfesional;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;        
    private Profesional profesional; 

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }

    @Override
    public String toString() {
        return "CitaMedica{" +  "fecha='" + fecha + '\'' + ", hora='" + hora + '\'' +", paciente=" + (paciente != null ? paciente.toString() : "null") +", profesional=" + (profesional != null ? profesional.toString() : "null") +'}';
    }
}
