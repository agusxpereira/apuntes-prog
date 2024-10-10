## This
Hace referencia a mí como objeto. Hace todo el recorrido de herencia para buscar un método en especifico y ejecuta el primero que esté definido.

Muchas veces usamos protected si queremos que las clses hijas conozcan el atributo. Sobre todo se recomienda no usar public



super es la referencia explicita a métodos (generalmente se usan para métodos) de la clase padre. Se desaconseja usarlo para atributos, porque si alguien hace referencia a un atributo, con `super.nombre` significa que me refiero al atributo nombre de mi clase padre, si alguien que heredó de mí, tambien puso un atributo nombre, ese super no está. Salteamos la misma clase. 

El estado está en el objeto. En el ejemplo, cuando definimos un atributo public para un objeto, si yo lo accedo desde otro objeto para cambiarle el valor, ese valor se cambia sólo en el objeto que está haciendo el cambio:

```java

    A aux = new A();//acá es donde se crea el "estado" del objeto
    B auxb = new B();


    aux.a3();//define los atributos

    auxb.atributoPublico = 2;//no se cambia el valor de aux, sino el que está en auxb
```



Desde el objeto no podemos llamar a un método del padre directamente, sólo desde la estructura interna en un método: 

```java
//Esto no lo podemos hacer:
// objetoC.seper.getName();
//Pero si podemos ahcer algo así dentor del contructo de objetoC

public String getNombre(){
    //claramente no tendría sentido decir el atributo del objeto llamando al getAtributo del padre, es  sólo un ejemplo, super generalmente se utiliza para sobreescribir el coportamiento pre definido en la clase de la cual heredamos
    return super.getNombre();
}

```


Super es ***ESTATICO*** siempre llama al padre, osea de quién heredo según quien me esté llamando. Es decir, si yo soy un objeto, llamo *a un método definido en mi padre*, y ese método tiene la palabra reservada *`super`* porque esta redefiniendo copmportamiento, *llama a su padre*. Desde mi como objeto, llamaria al padre de mi padre.


### Static

La palabra static  hace que todos los objetos compartan un mismo atributo definido en la clase o bien que los crea o de la cual heredan. 

```java
    private int id;
    public static int contador = 0;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        id = contador;
        contador++;
    }

```
Ahora podemos asignar un id para cada persona, y ala vez tener un registro de cuantos objetos tenemos creados. 


Si queremos saber cuantas personas creamos, sin necesidad de crear otra Persona, para eso definimos el meétodo de clase *static*. No necesitamos una instancia para invocarlo, lo podemos haer conociendo a la clase.

sysout(Persona.getContador());

Un método de clase no puede acceder a las variables de intancia, sólo a las de clase. Un metodo estatico no puede referenciar a un campo no estatico. En un método de clase no podemos usar el this, porque no hay objetos en ese momento (dentro del método).


### final

Si a final no le agregamos la palabra `static` vamos a tener un atributo final por cada objeto. 

`public static final int MAYORIAEDAD=18`

Al ser final, como deben tener acceso todos los objetos y desde afuera no se puede cambiar, podemos declararla publica. También por si la necesitamos "desde afuera" para algo.
<!--52:22-->

```javascript
let arrayToTest = [1, 1, 1, 2, null];
let cantElementos = 4;
function corrimiento_izq(pos) {
  for (let actualPos = pos; actualPos < cantElementos; actualPos++) {
    arrayToTest[actualPos] = arrayToTest[actualPos + 1];
  }
  cantElementos--;
}

corrimiento_izq(2);
console.log(arrayToTest);

```