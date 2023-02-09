package observer;

import java.util.ArrayList;
import java.util.List;

public class Observado{

    private List<Observador> observadores;
    public Observado() {
        super();
        observadores = new ArrayList<Observador>();
    }
    public void suscribirObservador(Observador observador) {
        observadores.add(observador);


    }
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }
    public void notificarObservadores() {
        for(Observador observador: observadores) observador.notificar();

    }

}
