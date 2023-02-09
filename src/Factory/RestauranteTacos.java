package Factory;

public abstract class RestauranteTacos {
    public void ordenarTaco() {
        System.out.println("Preparando tu Taco...");

        //Se crea taco sin que le importe cual es
        Taco taco = crearTaco();

        //Se muestra el taco sin que le importe cual es
        taco.preparar();
    }

    //Abstraccion para crear cada taco desde cada factory
    public abstract Taco crearTaco();
}
