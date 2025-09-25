
package CitaPacienteProfesional;

public class Principal {
    public static void main(String[] args) {
        Paciente p = new Paciente("Nicolas Bonanno", "OSDE");
        Profesional prof = new Profesional("Dr. Rodriguez", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-03", "14:30", p, prof);

        System.out.println(cita);
    }
}
