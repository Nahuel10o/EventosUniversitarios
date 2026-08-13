public class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public final int CUPO_MINIMO;

    public Actividad (int id, String titulo, int cupoMaximo, int CUPO_MINIMO){
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.CUPO_MINIMO = CUPO_MINIMO;
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
