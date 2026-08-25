import java.util.ArrayList;
import java.util.Collection;

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

    public EventoUniversitarios (String Id, String titulo, double costoBase, boolean gratuito){
        this.Id = Id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<>();
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
    public void mostrarActividades(){};

    //metodos
    public void mostrar(){
        System.out.println("Id: " + Id);
        System.out.println("titulo: " + titulo );
        System.out.println("costo: " + calcularCostoEstimado());
        System.out.println("gratuito: " + gratuito );
        System.out.println("Sala:" + (sala !=null ? sala.getNombre() : "Sin sala asignada"));


    }

    public double calcularCostoEstimado(){
        if (this.gratuito)
            return 0;
        else
            return costoBase * 1.21;
    }



}