mensaje != método
El mensaje es lo que se envia al objeto, el método es lo que se ejecuta en respuesta.

Cada objeto tiene su propio espacio en memoria. Siempre es instancia de una clase, y esta define objetos similares.

Composicion, los objetos pueden contener a otros objetos. 
Encapsulamiento, sus datos son privados, sus métodos son tipicamente publicos.

### Figuras geometricas:

Tenemos 3 figuras, cuadrado, circulo, y triangulo, cada una con sus particularidades. Pero las 3 en sí son figuras, abstraemosel concepto de figura geometrica. Las 3 tienen cosas en común por ejemplo el area, pero tambien tienen disitntas cosas como lados o radio. 

### Herencia
Abstraemos, clasisficamos etc. Las 3 figuras anterioires son clases que tienen en comun cosas como el nombre el color, etc. 
Enconces usamos abstracion para classificar entidades. La extension permite ampliar las caracteristicas de una clase en una sub-clase. Lo que lo hace un mecanismo de reúso.


Por ejemplo tenemos una superclase Figure, y tres sub-clases representando a nuestras figuras. En la primera, Figure tenemos un método en común para todos, como por ejemplo getArea();


En las sub-clases, el getArea no va a ser igual para cada una, por lo que tenemos que redefinir el comportamiento.

Los constructores no se heredan. Lo que significa que en las subclases debemos llamar al constructor de la clase que heredan, est se invoca con las palabra reservada `super()`. 

`this` -> se refiere a "yo".
`super` -> se refeire a mi padre.

Los constructores se van llamando uno detras de otro. Así por ejemplo, a Circulo le podemos pedir: el getRadio, por ser Circulo y por ser Figura tiene: getNombre y getArea.

El mensaje digamos que recorre el "arbol genealogico" hasta encontrar el método, ejecuta el primero que encuentra (arranca desde la sub clase más abajo digamos, y busca en sus predecesores).

Que el método en común esté en la superClase Figura se debe al concepto de Polimorfmismo.

Tenemos distintas instancias, ff1 es una Figura, y cc1 es un circulo. En este sentdiddo, esto tiene sentido? `ff1 = cc1`. Considerando que Java es fuertemente tipado, podemos decir que si, ya que el circulo es una figura. En cambio `cc1 = ff1` da error porque no necesariamente la figura es un circulo.

Si a ff1 le decimos `.getArea()` (despues de hacer el cambio), ff1 nos devuelve el area del circulo.

Esta es la potencia de Polimorfismo. ff1 que antes era una Figura, ahora apunta al objeto Circulo.
Por esto no sabemos tambien que método se puede responder a un mensaje, ya que Figura puede ser cualquier cosa que la hereda, el mensaje puede ser interceptado por cualquier de los métodos de estas.


La variable definida como Figura, puede ser luego cualquiera de sun hijos, nietos  bis-nietos, etc.

Luego de `ff1 = cc1`, ff1 apunta circulo, le podemos enviar los mensajes de su tipo, el getNombre, el getArea, ***pero no `getRadio`***.

El polimorfismo es la capicidad de un objeto de tomar distintas formas. (siempre y cuando hereden de este)
Java controla por el tipo del objeto, si ff1 es del tipo Figura sólo podemos enviar mensajes del tipo Figura por decirlo de una manera. A metodos que esten en Figura.

Tambien podemos heredar de las sub-clases. Es nueva clase que por ejemplo herede Circulo, llamado MedioCirculo, heredamos de Circulo y heredamos a su vez de Figura. Por lo que en su contructor podemos hacer lo siguiente:

```java
public class MedioCirculo extends Circulo{
    public MedioCirculo(double radio){
        super(radio);
        this.setNombre("Medio Circulo");// método de circulo
    }

    public double getArea(){
        return super.getArea()/2;//queremos cambiar el comportamiento del padre
    }
}
```

Cuando heredasmo, lo que buscamos es heredar comportamiento y cambiarlo, o bien cambiar algo, si no hacemos nada de eso, nos quedamos directamente con por ejemplo Figura.

### Binding dinamico
Determina que método debe ejecutarse segun el mensaje dado a un objeto.

`ff1.getArea()`; -> ese es el mensaje y el método se determina en tiempo de ejecucion.

Pero si el método es estatico, siempre se va a ejecutar este "que está en la clase". Y no el del objeto. Por ejemplo

```java
/*
 * Si usuario apreieta1
 *  ff1 = Triangulo
 * Else
 *  ff1 = Circulo
 * 
 * ff1.getArea();
 * 
 * En este ejemplo, sólo vamos a saber que nos deuelve el ff1.getArea una vez se ejecute el programa, es decir en tiempo
 * de ejecucion, mientras tanto sólo sabemos que se va a pedir el area, porque depende del input del usuario.
 * 
*/
```

### Polimorfismo:
Es la habilidad de una ***varibale o referencia*** de tomar valores de distintos tipos, lo que implica la respuesta a los mismo mensajes.

En la clase se da un ejemplo de como una Figura3D puede usar un objeto Figura como uno de sus atributos.

## Resumen teórico:

## Definiciones:

### **Atributo y variable de instancia:**
Un atributo especifica una *cualidad* del objeto.
- nombre
- velocidad
- poder

Una variable de instancia especifica como se almacenan los valores para esa cualidad.
El estado del objeto es el conjunto de valores que toman los atributos de este en determinado momento.

### Clase:
Es un molde para crear objetos. También podemos verlo como una fábrica para instanciar objetos. 

### Instancia:
Es el objeto creado a partir de la clase. Lo que hace la instanciacion sea el acto de crear una instancia.

### Objeto:
Es un componente de software. A su vez es intancia de una clase, y la minima unidad computacional que *encapsula* **estado** y **comportamiento**.

### Mensaje:
Un pedido enviado a un objeto que desencadena la ejecución de un método.

### Método:

La *implementacion* de una operacion. (Una operacion puede estar definida en todos los objetos, pero su resultado puede ser diferente  para cada uno de ellos, lo que es lo mismo en si es la ooperacion)

### Composicion:
Es la construccion de un componente mediante otros componentes. Es decir, los objetos pueden contener o estar formados por otros objetos.

### Encapsulamiento:
Los **datos**(atributos) en los objetos son ***privados***. Los **métodos** por su parte son tipicamente ***publicos***. 

### Herencia:
La herencia, es un mecanismo de abstracción, clasificación, extensión y reuso
- Es posible abstraer características comunes de varias clases en una "superclase"
- El mecanismo de abstracción sirve como mecanismo de clasificacion de entidades.
- La extensión permite *ampliar las caracteristicas* de clase en una subclase.
- Es un mecanismo de reuso tanto a nivel de diseño como de implementacion

Básicamente, en una superclase podemos clasificar una entidad, como AnimalMamifero, luego en cada sub clase, como "FamiliaCanina" podemos extender a las caracteriticas de esta superclase, sumando carecteristicas propias de los caninos.

En la herencia no es posible heredar desde una sub clase el constructor de la clase padre, para "inicializar" variables, o bien setear estado de atributos que se encuentran en la clase padre, como puede ser "nombre", debemos llamar al constructor de esta con la palabra reservada `super(nombre)`, este se debe llamar en la primer linea.

También debemos considerar para el envío de mensajes que JAVA es un lenguaje tipado, por lo que controla el envío de los mensajes por el *tipo* del objeto, es decir el *control es estático*.

Veamos un ejemplo: 

```java
public class AnimalMamifero(){
    private String nombre;
    public AnimalMamifero(String nombre){
        this.nombre = nombre;
    }

    public void caminar(){
        pata1.mover();
        pata2.mover();
        //simula el movimiento de una bipedo
    };
    public String hablar(){
        return "Soy un " + this.nombre + " y mi siempre me comunico de la siguiente forma: "
    }
}

public class AnimalCanino extends AnimalMamifero(){

    public int patas;

    public AnimalCanino(String nombre){
        super(nombre);
        patas = 4; 
    }

    public void caminar(){
        pata1.mover();
        pata2.mover();
        pata3.mover();
        pata4.mover();
        //simula el movimiento de un animal de 4 patas
    }

    public String hablar(){
        return "Soy un " + this.nombre + " y mi siempre me comunico de la siguiente forma: "
    }
}

//main:

AnimalMamifero a1 = new AnimalMamifero("mono");
AnimalCanino a2 = new AnimalCanino("Perro");

a1 = a2;

a1.caminar();

/*En este caso, si bien a1 apunta a un AnimalCanino su tipo es de AnimalMamifero, por lo que sólo conoce el método definido en su clase, para su tipo, asique va a mover 2 patas, en vez de cuatro.

El hecho de que a1 pueda tomar un valor de a2, se debe a que una clase padre puede ser cualquiera de sus hijos. Pero solo puede usar métodos que conoce.

*/

```
### Super:
Es similar a `this()`, pero se útiliza para refirse a "mi padre". Lo usamos para poder invocar un método y modificar su comportamiento. Supongamos que tenemos la clase "AnimalPerro" y lo usamo para invocar un método y módificar su comrtamiento. ("hablar").

```java
public class AnimalPerro extends AnimalCanino(){
    public void hablar(){
        return super.hablar() + "Guau Guau";
    }
}
```


### Binding dinámico:
Es un mecanismo a través del cual el método que se ejecuta en respuesta a un mensaje se determina dinámicamente dependiendo de la clase a la que pertenezca la instancia que recibio el mensaje.

### Polimorfismo:

Es la habilidad de una variable o referencia de tomar valores de diferentes tipos, lo que implica la respues a los mismo mensajes. 

Por ejemplo: 
```java
public void imporimirAnimal (AnimalMamifero af){
    System.out.println("Es animal es " + af.getNombre() "y se comunica de la siguiente manera" a1.hablar());

}

```

Siempre y cuando `af` herede de `AnimalMamifero`, esta variable puede tomar distintas formas.

Polimorfismo y
binding dinámico
son dos mecanismos
esenciales que
permiten el reuso y son
la base de la potencia y
elegancia de la POO