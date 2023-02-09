package adapter;

public class KelvinAdapter implements ICelsiusDegree {
    private Kelvin kelvin;

    public KelvinAdapter(Kelvin kelvin) {
        this.kelvin = kelvin;
    }

    @Override
    public double getCelsiusDegree() {
        return kelvin.getDegree()-273.15;
    }
}
