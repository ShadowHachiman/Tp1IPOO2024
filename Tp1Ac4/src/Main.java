/*
Una empresa de logística desea automatizar el control de peso y valor de artículos que
envían en sus contenedores. La empresa maneja muchos contenedores. La misma está
compuesta por un nombre, una dirección y los contenedores.

El contenedor tiene un número de identificación, un país destino (hacia donde se envía)
y un peso máximo de carga.

Los productos simples están compuestos por un nombre, una fecha de vencimiento y un
valor. Las cajas están compuestas por muchos productos simples el valor de la caja está
dado por la suma de sus productos simples.

1. Realice el diagrama de clases en UML.

2. Desarrolle en JAVA todos las clases y métodos necesarios teniendo en cuenta que el
sistema debe tener como mínimo la siguiente funcionalidad:

a) Retorna el peso del artículo.
public float pesoArticulo(Articulo un Articulo)

b)  Retorna el peso del contenedor. Sumando las cajas y los productos
simples.
public float pesoContenedor(Contenedor unContenedor)

c)  Retorna la suma de todos los contenedores.
public float pesoContenedores()

d)  Retorna el valor de todos los artículos del contenedor.
public float valorDeLosArticulos(Contenedor unContenedor)

e)  Retorna la suma de todos los valores de los contenedores
public float valorDeTodosLosArticulo()

 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}