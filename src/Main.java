import Factory.RestauranteTacos;
import Factory.TacoMexicanoFactory;
import Factory.TacoMixtoFactory;
import Factory.TacoVegetarianoFactory;
import adapter.*;
import observer.Cliente;
import observer.Concierto;
import observer.OrganizadorEvento;


public class Main {
    public static void main(String[] args) {

        //Proceso Adapter
        Celsius celsius = new Celsius(0);
        FahrenheitAdapter fahrenheitAdapter = new FahrenheitAdapter(new Fahrenheit(32));
        KelvinAdapter kelvinAdapter = new KelvinAdapter(new Kelvin(273.15));

        System.out.println(celsius.getCelsiusDegree()+"\n"+
                           fahrenheitAdapter.getCelsiusDegree()+"\n"+
                           kelvinAdapter.getCelsiusDegree());

        //Proceso Observer
        Concierto mora = new Concierto("Mora", 10, "Ocesa", 10000);

        Cliente felipe = new Cliente("Felipe", 2, mora);

        OrganizadorEvento organizadorEvento = new OrganizadorEvento(mora, felipe);

        Cliente sara = new Cliente("Sara", 3, mora);

        OrganizadorEvento organizadorEvento1 = new OrganizadorEvento(mora, sara);

        mora.suscribirObservador(felipe);
        mora.suscribirObservador(organizadorEvento);

        mora.setEstadoConcierto("disponible");

        mora.suscribirObservador(sara);
        mora.suscribirObservador(organizadorEvento1);
        mora.setEstadoConcierto("no disponible");

        //Proceso FactoryMethod
        System.out.println("Bienvenido a la Taqueria");
        System.out.println("------------------------");

        //Factory de taco mexicano
        RestauranteTacos mexicano = new TacoMexicanoFactory();
        mexicano.ordenarTaco();

        //Factory de taco mixto
        RestauranteTacos mixto = new TacoMixtoFactory();
        mixto.ordenarTaco();

        //Factory de taco vegetariano
        RestauranteTacos vegetariano = new TacoVegetarianoFactory();
        vegetariano.ordenarTaco();
    }
}