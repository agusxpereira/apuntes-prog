En el ejemplo de la clase 2, el del dao, vamos a agregar un jugador tamproso. Este jugador, tiene "tendencia positiva" a sacar 5 o 6 claramente con trampa.

Dado Cargado es un dado -> justifica su herencia porque cambia el comportamiento de tirar.

Siempre vamos a ver generalmente a la palabra `super` para ejecutar un método dentro del mismo método que estamos "modificando" si es requerido.

Cada constante que dejemos en el codigo, implica que un comportamiento nuevo requiera una clase nueva. (DadoCargado con probabilidad)
Los objetos sólo pueden recibir mensajes para ejecutar métodos de su tipo. Es decir, si un dado tipo Dado, ahora apunta a DadoCargado si va a poder ejecutar tirar, pero el que está definido en Dado.

JugadorTramposo juega con los dados cargados, por lo que cambia el comportamiento de Jugador. Ya que es el quién guarda los dados para hacer trampa.

Por lo que, cuando a una variable JugadorTramposo, le enviamos el mensaje `.tirar()`, a quien le llega ese mesaje es a un objeto del tipo JugadorTramposo, y es ese método el que se va a ejecutar.

No deben existir clases iguales.
Si tenemos dos contantes que hacen lo mismo pero alteran un poco el comportamiento, en vez de tener una clase aparte deberiamos considerar que sean la misma clase. Nos faltó solo abstraer el comportamiento

El tipo Object es el super padre de todos, lo podemos usar para extender la herencia a todos los hijos. A cualquier objeto, no importa de que  tipo sea, tenemos 3 métodos fundamentales (vamos a usar 2 mas que nada), estos son `equals` `toString` (y el que no vamos a usar mucho es `finalize`)

### equals:
- Retorna true cuando dos objetos tienen *iguales valores*
- La implementaicon por defecto compara referencais con ==


```java
    Jugador j1 = new Jugador("Agus");
    Jugador j2 = new Jugador("Gonzalo");

    if(j1 == j2){
        
        sysout("iguales");
    }else{
        //imprime distintos
        // == -> se fija la direccion de memoria
        
        sysout("distintos");
    }

    if(j1.equals(j2)){
        
        sysout("iguales");
    }else{
        //imprime distintos
        // == -> se fija la direccion de memoria
        
        sysout("distintos");
    }
    /*
    Tambien da false si hacemos un (if(j1.equals(j2)))
    */

```
Ahora podemos sobreescribir el metodo equals en la clase Jugador

```java
    public boolean equals(Object o1){
        try{
            //pasamos un Objetc y no un jugador porque estamos redifiniendo el método de Object, que espera un objeto
            String nombreAfuera = ((Jugador) o1).getNombre();//con el casting "bajamos la categoria" a cualquiera de sus hijos
            /*Formzamos a Java a tratar a o1 como un Jugador (no lo convierte)*/
            return nombre.equals(nombreAfuera);//so objetos String
        }catch(Exception e){
            return false;
        }
    }
```
Un caso para ilustrar mejor:
```java

    Dado d1 = new DadoCargado(6,6);//la variable apunta a un DadoCargado
    //Pero el tipo de la variable es Dado
    //por lo que no podemos hacer:
    //d1.setProbabilidad(0.6);
    //Pero, en este caso si lo podemos castear (recordemos que degrada en el arbol de tipos)
    ((DadoCargado)d1).setProbabilidad(0.6);
    //Si hubiese sido
    //Dado d1 = new Dado(6);
    //Acá sí no podemos castear




```

Para Strings es importante comparar con equals, porque de esta manera comparamos el contenido.


```java
public String toString(){
    return "mi nombre es " + nombre;
}
//+ está sobrecargado, agrega toString()
```
<!--https://www.youtube.com/watch?v=SQvXgnD7QHk&ab_channel=LuisBerdun 1:16:08-->



## Filmina - juego de dados:
Queremos impllementar una funcionalidad de un DadoCargado, es decir, que favorezca la posibilidad de sacar un 5 o 6. Si nosotrosd hicieramos una clase DadoCargado5 y 6 estariamos implementando de mala manera la herencia. 

```java
public class Dado{
    int valor;
    int caras;

    public int tirar(){
        return (Math.random()*caras)+1;
    }
}
```

```java
public class DadoCargado extends Dado{
    int ladoCargado;
    double tendencia;//0.5
    public int tirar(){
        if(Math.random()>tendencia);
            return super.tirar();
        else
            return ladoCargado;
    }
}
```
Es un mal ejemplo porque no pueden existir dos clases iguales. Dos clases iguales son la misma, cuando la diferencia es solo una constante, entonces también son la misma clase.

Malos ejemplos:

- PersonaJuan
- PersonaPedro ---> "Juan"

----> Existe el nombre en variables llamadas de esa manera.

Se supome que no deben haber constantes en el código. Esa es una manera de reconocer errores de herencia.


Clase Object:

Object es una clase. Pero a su vez, es la superclase de todos los objetos de todas las clases. Directa o indirectamente todos heredan de Objecto.

```java
public class Object {
    public boolean equals( Object obj );
    public String toString() 
    public void finalize() 

}
```

Estos métodos pueden ser redefinidos en las subclases si es necesario.

### equals:
- Retorna true cuando dos objetos tienen iguales valores.
- La implementación por defecto compara *referencias* con ==.

#### Ejemplo equals Dado
```java
public class Dado{
    public boolean equals(Object obj){
        //para redefinir un método no podemos cambiar la signatura
        Dado otroDado = (Dado) obj;//debemos tratarlo como un Dado, para que no dé error
        return this.getValor() == otroDado().getValor(); 
    }
}
```
```java
    Dado d1 = new Dado(3);
    Dado d2 = new Dado(3);
    (d1 == d2); //retorna false
    d1.equals(d2);//retorna true
```
### toString():
- toString() se usa para proveer una representación del objeto como una cadena de caracteres.
- Invoca automáticamente cuando utilizamos:
    - System.out.println() y "+".
    - String s = "The object is" + obj;
    - System.out.println(obj)
- La implementación por defecto de la clase Object retorna el nombre de la clase y la ubicación  en memoria del objeto

#### Ejemplo:
```java
    public class Dado{
        public String toString(){
            return "Dado con el valor = " + this.getValor();
        }
    }

```

### Finalize
Es un método deprecated, pero se utilzaba automaticamente para finalizar un objeto antes de ser eliminado por el GC


### Colecciones:
Los arreglos suelen tener un limite definido, y si queremos que crezca generalmente vmaos a tener que crear un nuevo arreglo.


### ArrayList:
ArrayList es una clase en Java import `java.util.ArrayList;`.
Proporciona una estructura de datos dinámica para almacenar elementos de manera consecutiva. A diferencia de los Arrays estáticos, los ArrayList pueden crecer o disminuir automáticamente según se necesario.

```java
ArrayList<String> nombres = new ArrayList<>();
nombres.add("Agus");
nombres.add("Jose");
nombres.add("Jorge");

String primerNombre = nombres.get(0);// Agus
nombres.set(1, "Robert");//modificamos el valor de la posicion 1
nombres.add(1, "Juan");//Agrega un elemento en la posicion 1 y realiza un corrimiento de los restantes
nombres.remove(2);// Elimina a "Robert"
int tamaño = nombres.size();//3
int indice = nombrex.indexOf("Agus");//0

for(int i = 0; i < nombres.size(); i++){
    System.out.println(nombres.get(i));
}


```
