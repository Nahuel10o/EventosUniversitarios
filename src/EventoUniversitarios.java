import java.util.ArrayList;


public class EventoUniversitarios {
    private final String  Id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;


    private static int cantEventos;

    private Sala sala;
    private ArrayList<Actividad> actividades;


    static {
        cantEventos = 0;
        System.out.println("Inicializador estatico: Se cargo la clase EventoUniversitario.");
    }

    public EventoUniversitarios (String Id, String titulo, double costoBase, boolean gratuito, int id, String nombre, int cupoMaximo){
        this.Id = Id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<>();
        this.crearActividad(id, nombre, cupoMaximo);
        cantEventos++;
    }

    public EventoUniversitarios (EventoUniversitarios otro) {
        this.Id = otro.Id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        this.actividades = new ArrayList<>(otro.actividades);
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

    public void crearActividad(int id, String nombre, int cupoMaximo){

        Actividad actividad = new Actividad(id, nombre, cupoMaximo);
        this.actividades.add(actividad);

    }
    public ArrayList<Actividad> getActividades(){
        return actividades;
    }

    //metodos
    public void mostrar(){
        System.out.println("\n\ntitulo: " + titulo );
        System.out.println("Id: " + Id);
        System.out.println("costo: " + calcularCostoEstimado());
        System.out.println("gratuito: " + gratuito );
        System.out.println("Sala:" + (sala !=null ? sala.getNombre() : "Sin sala asignada"));
        for(Actividad i: actividades) {
            i.mostrarActividad();
            i.mostrarInscripciones();
        }

    }

    public double calcularCostoEstimado(){
        if (this.gratuito)
            return 0;
        else
            return costoBase * 1.21;
    }



}