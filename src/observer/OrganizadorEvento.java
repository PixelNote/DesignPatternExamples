package observer;

public class OrganizadorEvento implements Observador {
    private Concierto concierto;
    private Cliente cliente;


    public OrganizadorEvento(Concierto concierto, Cliente cliente) {
        this.concierto = concierto;
        this.cliente = cliente;
    }

    public void notificar() {
        System.out.println(concierto.getOrganizador() + " les informamos que el evento " +
                "organizado por ustedes de " +
                concierto.getArtista() +
                " ha sido creado");
    }
}
