public class EventoUniversitarios {
    private final String  Id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantEventos;

    private Sala sala;
    private Actividad actividad;

    public EventoUniversitarios (String Id, String titulo, double costoBase, boolean gratuito, int id, String nombre, int cupoMaximo, int CUPO_MINIMO){
        this.Id = Id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividad = new Actividad(id,titulo, cupoMaximo, CUPO_MINIMO);
        cantEventos++;
    }

    public EventoUniversitarios (EventoUniversitarios otro) {
        this.Id = otro.Id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public static int getCantEventos() {
        return cantEventos;
    }

    public void agregarSala(Sala sala){
        this.sala = sala;
    }

    //metodos
    public void mostrar(){
        System.out.println("Id: " + Id);
        System.out.println("titulo: " + titulo );
        System.out.println("costoBase: " + costoBase);
        System.out.println("gratuito: " + gratuito );
        System.out.println("cantEventos: " + cantEventos );
    }
    public double calcularCostoEstimado(){
        if (this.gratuito)
            return 0;
        else
            return costoBase;
    }
    public void asignarSala(){

    }
    public void crearActividad(int id, String titulo, int cupo){

    }

}