package observer;

public class Concierto extends Observado {

    private String artista;
    private int maximoBoletas;
    private String organizador;
    private int precioBoleta;
    private String estadoConcierto;

    public Concierto(String artista, int maximoBoletas, String organizador, int precioBoleta) {
        this.artista = artista;
        this.maximoBoletas = maximoBoletas;
        this.organizador = organizador;
        this.precioBoleta = precioBoleta;
        estadoConcierto = "";
    }

    public String getOrganizador() {
        return organizador;
    }

    public String getArtista() {
        return artista;
    }

    public int getPrecioBoleta() {
        return precioBoleta;
    }

    public String getEstadoConcierto() {
        return estadoConcierto;
    }

    public void setEstadoConcierto(String estadoConcierto) {
        this.estadoConcierto = estadoConcierto;
        notificarObservadores();
    }
}
