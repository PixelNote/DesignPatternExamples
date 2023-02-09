package Factory;

public class TacoMexicanoFactory extends RestauranteTacos {
    public Taco crearTaco() {
        return new TacoMexicano();
    }
}
