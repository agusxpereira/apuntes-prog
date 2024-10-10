## Comparacion de objetos

Si usamos el algoritmo de burbujeo para ordenar un arreglo, este ordena numeros enteros:

```java
public void ordenar(int[] arr){
    int n = arr.length;
    int temp = 0;

    for(int i = 0; i < n; i++){
        for(int j = 1; j < (n-i);j++){
            if(arr[j-1] > arr[j]){
                //intercambio los elementos
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
```

Este método no ordena otras cosas que no sean arreglos, ***¿como podemos implementar un método que sea capaz de ordenar cualquier tipo de objeto (según nuestro criterio)***.

- Tenemos que comparar los objetos `if(arr[j-1] > arr[j])`.
- Sabemos que a un objeto **siempre** se le envien mensajes.
  - Podriamos hacer algo como: `arr[j-1].esMenor(arr[j])`.
- Pero Object no tiene dicho método.

## Comparable

Cuando una clase implementa la ***interfaz*** `Comparable` está obligada a definir el método:
`public int compareTo(Object o)`

Este método permite comparar *instancias de dicha clase* entre si, por ejemplo si mi clase se llama `Persona` e *implementa* `Comparable`, puedo hacer:

```java
    Persona p1 = new Persona(...);
    Persona p2 = new Persona(...);

    int comparacion = p1.compareTo(p2);
```

***comparacion***:


|retorna|condicion|comparacion|
|:-----:|:-------:|:---------:|
| `< 0` |***si*** | p1 < p2   |
| `= 0` |***si*** | p1 = p2   |
| `> 0` |***si*** | p1 > p2   |

 Si una clase implementa ***Comparable*** se habilita la posibilidad de usar el método. `Collections.sort(List)` para ordenar listas de ese tipo de objetos.

```java
    ArrayList<Persona> personas = new ArrayList<>();
    personas.add(p1);
    personas.add(p2);
    Collections.sort(personas);
```

- Los elementos se ordenan según la lógica del ***compareTo*** (Es decir el método que sobreescribimos en la clase `Persona`, que implementamos de la clase `Comparable`).
- Si los objetos almacenados <u>NO</u> son ***`Comparable`***, entonces **NO** puedo utilizar `Collections.sort(List)`;

### Clase Comparable

Sólo permite ***UNA*** forma de comparar los elementos (la que establezca el método `compareTo`), y esa forma no puede cambiar.

Si por ejemplo, quiero modificar la forma en la que mi lista de *Persona* se ordena, no puedo hacerlo. Tengo que cambiar el `compareTo` y recompilar todo mi código.

¿Y si quiero cambiar la forma en la que se ordenan las personas? ¿Qué hago cuando quiero que algo *pueda cambiar dinamicamente*?

***Encapsulo esa porción de lógica en un objeto y la saco afuera:*** `Comparator`.

## Comparator

- Cuando una clase implementa la interfaz `Comparator` debe implementar el método:
  - `public int compare(Object o1, Object o2)`
- En este método, se comparan los dos objetos (o1 y o2) de la forma que se necesite. Por ejemplo, puedo tener una clase:
```java
    ComparadorProcesosMemoria implements Comparator{...}
```
 que compare dos procesos según su consumo de memoria. Y otra clase:

```java
    ComparadorProcesosCPU
``` 

- Deinir un Comporator me permite utilizar el método:

`Collecionts.sort(List, Comparator)`

- Este método ordena los elementos de una lista (*primer parametro*), según la manera de comparar los elementos de un comparator (*segundo parametro*, lo definimos nosotros)
- En este punto, al especificar un Comporator, <u>NO es necesario</u> que la clase de los objetos que se van a ordenar (por ejemplo `Proceso`) sea Comparable.

Por ejemplo, con *Comparator* puedo hacer:

```java
ArrayList<Proceso> procesos = new ArrayList<>();
procesos.add(p1);
procesos.add(p2);

Comparator comparadorMem = new ComparadorProcesosMemeoria();
Collections.sort(procesos, comparadorMem);

Comparator comparadorCPU = new ComparadorProcesosCPU();
Collections.sort(procesos, comparadorCPU);

//las clases comparador... implementan el método de la interfaz Comparator, lo que permite que puedan ser usados en un Collections.sort(List, Comparator)

```

- Con este mismo método *sort*,
  - `Collections.sort(List, Comparator)`
- puedo ordenar por orden inverso del orden dado por Comparable:
  - `Collections.sort(List, Collections.reverseOrder());`
- Y el orden inverso, ***dado por un comparador pasado como argumeto:***
  - ```java 
    ComparadorMemoria comp = new ComparadorMemoria();
    Collections.sort(list, Collections.reverseOrder(comp));
    Collections.sort(list, comp.reversed());


### Evitar usar casting:
Para evitar hacer casting de Object a la clase que queremos comparar, tanto en **Comparable** como en **Comparator** podemos indicar el tipo de clase que vamos a comparar.

- En comparable:
```java
    public class ComparadorCPU implements Comparator<Proceso>{
        public int compare(Proceso p1, Proceso p2);
    }
```


## Diferencias entre `Comparable` y `Comparator`

| `Comparable`               |         `Comparator`     |
|:--------------------------:|:------------------------:|
|Se utiliza para ordenar objetos con su orden "natural"| Se usa para ordenar objetos de acuerdo a los valores  de diferentes atributos|
|Utiliza el método `compareTO(Object otroObjeto)` | Utiliza el método `compare(Object o1, Object o2)` |
|Compara `this` con respecto a otro objeto | Compara dos objetos recibidos por parametros|
| Está en el paquete *java.lang*, junto a la clase `Object` | Está en el paquete *java.util*|
| Debe ser ***implementado por la clase original***, aquella que quiero que sus instancias se puedan comparar (por ejemplo Persona, Computadora, Proceso) | ***No afecta a la clase original***. Se implementan ***clases independientes*** de la misma|

## [Clase online](https://www.youtube.com/watch?v=N1ZVmxhJWFU&t=7407s)


Códigos:

```java
//Comparator CompararSueldo

public class CompararSueldo implements Comparator<Empleado>{
    @Override
    public int compare(Empleado o1, Empleado o2){
        return o1.getSueldo() - o2.getSueldo();
        //Si retorna menor a 0: a1 es menor que a2
        //Si retorna 0: son iguales
        //Si retorna mayor a 0: a1 es mayor que a2
    }
}

```

```java
public class CompararApellido implements Comparator<Empleado>{
    @Override
    public int compare(Empleado o1, Empleado o2){
        return o1.getApellido().compareTo(o2.getApellido()) ;
        return o1.getApellido().compareTo(o2.getApellido()) ;
        //Este compareTo es el de 'Compare' implementado en las Strings.
        //Tambien devuelve un int
    }
}

```
```java
    public class CompararNombre implements Comparator<Empleado>{
        @Override
        public int compare(Empleado o1, Empleado o2){
            return o1.getNombre().compareTo(o2.getNombre()) ;
        }
    }
```

```java
    //comparador inverso

    public ComparadorInverso implements Comparator<Empleado>{
        private Comparator<Empleado> directo;

        public ComparadorInverso(Comparator<Empleado> directo){
            //seteamos
            this.directo = directo;
        }

        @Override
        public int compare(Empleado o1, Empleado o2){
            //la "negacion" de lo que me devuelva el comparador que queremos invertir
            return -directo.compare(o1, o2);
        }
    }
```

```java
//comparador compuesto
public class ComparadorCompuesto impements Comparator<Empleado>{
    private Comparator<Empleado> c1;
    private Comparator<Empleado> c2;


    public ComparadorCompuesto(Comparator<Empleado> c1, Comparator<Empleado> c2){
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public int compare(Empleado e1, Empleado e2){
        int res = c1.compare(e1, e2); //compara a los empleados según su criterio

        if(res == 0)
            return c2.compare(o1, o2);//Si para c1 son iguales, queremos comparar segun otro criterio

        return res;


    }

}
```
> Vamos por partes:
>
> En determinado grupo, buscamos a los empleados con cierta especialidad de la siguiente manera:
```java
    //Emleados con
    public ArrayList<Empleado> empleadosCon(String especialidad){
        ArrayList<Empleado> empleadosConEspecialidad = new ArrayList<>();

        for(ElementoEmpresa emp: elementos){
        //recorremos la totalidad de empleados
            empleadosConEspecialidad.addAll(emp.empleadosCon(especialidad));
            /*Acá sigue con el principio de composite, si es un empleado devuelve la especialiad, si es un grupo vuelve a hacer un foreach.
            
            addAll se encarga de añadir todos los elementos de las sub listas que se van armando en cada nivel (hasta un empleado devuelve una sublista por la signatura del método)
            
            En la clase empleado, solo devuelve una lista si las especialidades coinciden

            */
        }
    }
```

```java
    //ordenamos a todos los empleados con especialidad en Java por sueldo, este método está en los grupos o empresas (la calse compuesta):
    //lo llamamos: ArrayList<Emppelado> empJava = empresa.empleadosCon("Java", cSueldo);

    public ArrayList<Empleado> empleadosCon(String especialidad, Comparator<Empelado> orden){

        ArrayList<Empleado> empleadosConEspecialidad = this.empleadosCon(especialidad);
        Collections.sort(empleadosConEspecialidad, orden);
        return empleadosConEspecialidad;
    }



```

### Uso de comparador compuesto

En el ejemplo, para comparar por 3 criterios distintos, hace dos comparadores compuestos, primero hace uno para comparar por nombre o sueldo, el otro comparador compuesto compara pirmero por apellido, y luego por el otro comparador compuesto. Lo que seria una cadena