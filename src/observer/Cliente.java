package observer;

public class Cliente implements Observador {
    private String nombre;
    public int cantidadBoletas;
    private Concierto concierto;

    public Cliente(String nombre, int cantidadBoletas, Concierto concierto) {
        this.nombre = nombre;
        this.cantidadBoletas = cantidadBoletas;
        this.concierto = concierto;
    }

    public int pagoTotal(){
        int pago = concierto.getPrecioBoleta()*cantidadBoletas;
        return pago;
    }
    public void notificar() {
        if (concierto.getEstadoConcierto().equals("disponible")){
            System.out.println("¡Hola" + nombre + "! Tus " +
                    cantidadBoletas+" boletas han sido compradas para el concierto de "+
                    concierto.getArtista()+" por un valor de "+ pagoTotal());
        }
        else {
            System.out.println("¡Hola" + nombre + "el concierto de "+
                    concierto.getArtista()+" aún no está disponible");
        }

    }

}
