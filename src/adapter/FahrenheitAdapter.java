package adapter;

public class FahrenheitAdapter implements ICelsiusDegree{
    private Fahrenheit fahrenheit;

    public FahrenheitAdapter(Fahrenheit fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double getCelsiusDegree() {
        return (fahrenheit.getFahrenheitDegree()-32)/1.8;
    }
}
