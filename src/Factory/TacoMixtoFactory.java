package Factory;

public class TacoMixtoFactory extends RestauranteTacos {
    public Taco crearTaco() {
        return new TacoMixto();
    }
}
