import adapter.*;


public class Main {
    public static void main(String[] args) {

        Celsius celsius = new Celsius(0);
        FahrenheitAdapter fahrenheitAdapter = new FahrenheitAdapter(new Fahrenheit(32));
        KelvinAdapter kelvinAdapter = new KelvinAdapter(new Kelvin(273.15));

        System.out.println(celsius.getCelsiusDegree()+"\n"+
                           fahrenheitAdapter.getCelsiusDegree()+"\n"+
                           kelvinAdapter.getCelsiusDegree());
    }
}