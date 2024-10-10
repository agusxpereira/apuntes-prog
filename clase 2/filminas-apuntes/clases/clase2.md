Resumen: El objeto encapsuila coomportamiento y estado. El estado son los valores que tiene el objeto, en el caso de "Juan Perez" estos valores serian el estado. 

Muchas veces el comportamiento se vé influido por el estado.

Las operaciones de una clase son las mismas para todas las instqancias, no así el comportamiento porque este depende del estado.

Composicion: la construccion de un componente mediante otro componente. Est quiere decir que un objeto puede estar cosntruido de varios objetos a su vez.

- Los datos son privados
- Los métodos son tipicamente publicos

Ejemplo: Juego de Dados -


Estan las filminas, pero en esta clase se está haciendo un ejemplo en vivo.
code example: Juegov1.java es la primer version. Es un programa que funcion y anda bien, pero no es un programa orientado a objetos. Por ejemplo, podriamos tener: Jugador, Dado, Cubilete. Acá distruibimos responsabilidades por ejemplo entre cada ejemplo.
 


 ## Ejemplo juego dados:

 - Identificar los objetos que intervienen en varios sistemas simples. 
 - Identificar sus responsabilidades y la forma en que colaboran entre sí.


 En nuestra primera version,  el juego se ejecutaba tódo desde una misma clase, funcionaba sí, pero no era una solucion orientada a objetos. Lo que lo haciía más dificil de mantener, modificar, extender y hasta de entender incluso. 

 Entonces, a partir de este ejemplo, pensamos en los objetos que deberia tener la clase juego. La primera que se nos viene a la cabeza es Dado y Jugador.

 *Dado*:

 - Es responsable de rodar por si mismo (en realidad, de generar un valor entre 1 y 6). (tirar)
 - Es responsable de responder cuál es el valor de cara obtenido (ultimoValor)
 - Recuerda el último valor obtenido (último valor)

 | Dado            |
 |-----------------|
 | ultimo valor    |
 |-----------------|
 | tirar()         |
 |ultimoValor():int| 
 |                 |

Para poder ejecutar nuestra aplicacion necesitamos una clase main(). Esta generalmente es usada para crear y enviar mensajes a otros objetos. 
```java
public static void main ( String[] args )
{
    Dado d = new Dado( );
    d.tirar( );
}
```

No necesariamente debe ser una clase única, este bloque puede estar en cualquier clase. 


Otras clases que podriamos necesitar son Jugador, Juego y Cubilete, cada una tiene sus propias responsabilidades y se encarga de distintas cosas. Esto a su vez nos permiten escalar la app, por ejemplo, que pasa si queremos jugar con más dados:

***Composicion de Objetos***:

Un cubilete tiene un conjunto de Dados, es decir, se compone de dados. Cuando tiro un cubilete en realidad, tiro todos estos dados de los que se compone. Esto tiene varias ventajas, por ejemplo, los objetos están conectados, la complejidad se reduce etc etc. 


|Cubilete------------|
|--------------------|
|dado1   <br>dado2   |
|--------------------|
|`tirar()`           |


El método tirar() en cubilete va a ejecutar el método tirar() de cada dado.

## Java - Referencias a Objetos y Asignaciones

- La asignación de objetos copia la referencia (direccion de memoria)

```java
Dado d = new Dado(); 
Dade e = new Dado();
d.setValor(1);
e.setValor(5);

e=d;

e.setValor(4);
d.ultimoValor();//retorna 4
```

### El operador ==
Este operador *compara **direcciones de memoria**, no valores*.

```java
Dado d = new Dado(5); 
Dade e = new Dado(5);

if( e== d)
    x++;//false "==" no se fija en los valores (5)

e=d;

if(e == d)
    y++;//Verdadero, referencian al mismo objeto

```

### Utilizando this
- *this* se refiere al objeto sobre el cúal el método fué invocado.

- El compilador implícitamente agrega
this a la invocación
de un método cuando no se especifica el receptor del
mensaje