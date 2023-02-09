# Revisión SOLID


## Integrantes

- Daniela Alejandra Puerto Diaz
- Yeyson Esteban Pulido Parra
- Andres Felipe Jimenez Albornoz




## Soluciones
###Patrón creacional
-----------------------
Suponga que se tiene que crear una solución de software para una tienda que vende tacos a domicilio, donde se manejan por el momento 3 sabores, Mexicano, Mixto y Vegetariano, cada tipo de taco está representado por una clase (TacoMexicano, TacoMixto, TacoVegetariano), a su vez, estas 3 clases se abstraen dentro de la interfaz llamada Taco. El proceso inicia cuando el cliente escoge qué sabor de taco quiere pedir, posteriormente, el software tendrá que identificar que taco necesita ser preparado para proceder a crear el objeto correspondiente al tipo de taco pedido para finalmente entregárselo al usuario. 

Sin embargo, podemos identificar un code-smell en cuanto a que dentro de la interfaz Taco se tendrán una serie de if y else if para primero identificar que clase debe ser llamada para preparar el pedido, así:

if (”Mexicano”) {

taco = new TacoMexicano();

} else if (”Mixto”) {

taco = new TacoMixto();

} else if (”Vegetariano”) {

taco = new TacoVegetariano()

}

Por lo que, esto claramente viola el principio Open/Closed, ya que cada vez que se quiera añadir o quitar un sabor, se tendrá que acceder a la interfaz Taco directamente para su modificación.
###Patrón estructural
------------------------
En este problema se implementó el patrón de diseño _Adapter_. Se tiene un sistema de calor que solo recibe grados Celsius, así que hay una clase llamada Celsius cuyo método devuelve su valor dependiendo del valor medido por el termómetro en Celsius a través de una interface. 
Se compro un nuevo termostato que envía los datos mediante grados Fahrenheit por lo que es necesario incluir un adaptador FahrenheitAdapter que transforma estos grados Fahrenheit a Celsius para reutilizar el método que obtiene los grados Celsius. 
Así mismo, se emplea el mismo procedimiento para un termómetro que envía los datos en grados Kelvin KelvinAdapter. Entonces cada clase, Fahrenheit y Kelvin, tienen su adaptador para hacer la conversión de grados.

###Patrón de comportamiento
------------------------------





