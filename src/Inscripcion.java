import java.time.LocalDate;

public class Inscripcion {
    private LocalDate fecha; //cambiar esto por LocalADate Cuando lo expliquen
    private String estado;
    private Actividad actividad;
    private Estudiante estudiante;

    public Inscripcion(LocalDate fecha, String estado, Actividad actividad, Estudiante estudiante) {
        this.fecha = fecha;
        this.estado = estado;
        this.actividad = actividad;
        this.estudiante = estudiante;
    }


}
