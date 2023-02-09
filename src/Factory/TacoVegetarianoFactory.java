package Factory;

public class TacoVegetarianoFactory extends RestauranteTacos {
    public Taco crearTaco() {
        return new TacoVegetariano();
    }
}
