package adapter;

public class Celsius implements ICelsiusDegree {
    private double degree;

    public Celsius(double degree) {
        this.degree = degree;
    }

    @Override
    public double getCelsiusDegree() {
        return degree;
    }
}
