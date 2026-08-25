import java.util.ArrayList;
import java.time.LocalDate;


public class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPO_MINIMO;

    private ArrayList<Inscripcion> incripciones;


    static {
        CUPO_MINIMO =5;
    }

    public Actividad (int id, String titulo, int cupoMaximo){
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = (cupoMaximo > CUPO_MINIMO) ? cupoMaximo : CUPO_MINIMO;
        this.incripciones = new ArrayList<>();

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getCupoMinimo(){
        return CUPO_MINIMO;
    }

    public Inscripcion inscribir(Estudiante estudiante){
        Inscripcion inscripcion = new Inscripcion(LocalDate.now(), "Registrado", this, estudiante);
        this.incripciones.add(inscripcion);
        return  inscripcion;
    }

    public void mostrarInscripciones(){
        for(Inscripcion i:incripciones){
            System.out.println(
                "Estado: " + i.getEstado() +
                "Fecha: " + i.getFecha() +
                "Estudiante: " + i.getEstudiante().getNombre() +
                "Legajo: " + i.getEstudiante().getLegajo()
            );
        }
    }


}