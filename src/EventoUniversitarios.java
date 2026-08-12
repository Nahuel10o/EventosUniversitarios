public class EventoUniversitarios {
    private final String  Id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private int cantEventos;

    public EventoUniversitarios (String Id, String titulo, double costoBase, boolean gratuito, int cantEventos){
        this.Id = Id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.cantEventos = cantEventos;
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

    public int getCantEventos() {
        return cantEventos;
    }

    public void setCantEventos(int cantEventos) {
        this.cantEventos = cantEventos;
    }
    public void mostrar(){
        System.out.println("Id: " + Id);
        System.out.println("titulo: " + titulo );
        System.out.println("csotoBase: " + costoBase);
        System.out.println("gratuito: " + gratuito );
        System.out.println("cantEventos: " + cantEventos );
    }
}
