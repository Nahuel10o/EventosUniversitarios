public class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPO_MINIMO = 10;

    private Estudiante estudiante;

    public Actividad (int id, String titulo, int cupoMaximo, int CUPO_MINIMO){
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;

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

    public int getCUPO_MINIMO() {
        return CUPO_MINIMO;
    }



}