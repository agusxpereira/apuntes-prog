## clases abstractas

En el ejemplo de figuras, no tenia sentido que podamos crear una instancia de la clase Figura, ya que en sí ella es una idea que agrupa a las demás figuras, una idea abstracta. Estas clases no puden instanciarse, pero si se pude heredar de ellas. Es una forma de "categorizar" clases.

```java
    //main
    Figura f1 = new Figura(); //-> esto ya no nos funciona 

```
Este tipo de clases, sólo pueden tener métodos abstractos. 
```java
    public abstract class Figura(){

    }

```

La clase abstracta define un comportamiento y obliga a sus hijos a implementar dicho método. Los métodos abstractos ***no tienen cuerpo***.

`public abstract double getArea();`
`public abstract double getPerimetro();`

Es decir, no se implementa nada en la clase abstracta, ni si quiera {}.


El metodo imprimir recibe objetos que extienden a Figura, a pesar de la abstraccion de Figura, sigue funcionando el ***Polimorfismo***.
```java

    public static void Imprimir(Figura ff){
        /*FF seria un objeto Figura sólo si apunta a un objeto Figura, pero siempre que lo llmamos lo haemos con objetos de clases concretas, va a ser de Tipo Figura o herede de ella y sea concreto*/
    }
    //tambien funcionaria:

    //Figura f1 = new Triangulo();
```

Si una clase que hereda de una clase abstracta, no puede implementar uno de ss métodos, entonces tambien debe ser abstracta. Una clase abstracta si puede implementar un objeto, lo que no puede es heredar un método y no implementarlo, si eso pasa es ahí cuando debe ser abstracta.

Override nos asegura que estamos sobreescribiendo un método, caso contrrio nos dá error.

Entonces esta clase obliga a definir un comportamiento para los métodos

Un metodo template es un método que es concreto, pero usa en su implementacion metodos abstractos de la clase