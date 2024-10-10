primero una aclaracion, por lo visto hoy seria la clase de patrones de diseño y la anterioir fue la de **interface**, yo las voy a dejar a las dos juntas y empiezo ahora con este patrone como algo nuevo. Esto viene a que la clase anterior recien tendria que haver sido la introduccion a composite, pero ellos lo subieron mal creo.

El patron y el ejemplo que vemos es el de ***Composite***.

Recién caigo que esta clase seria la práctica de la clase anterior, tengo que ver si va esta clase o va algo nuevo: [clase actual](https://www.youtube.com/watch?v=N1ZVmxhJWFU&ab_channel=MarceloG.Armentano)

## Patrones de diseñó - repaso

Composite es el patrón donde dos clases heredan de un Componente abstracto que define métodos, el hijo "simple" implementa estos métodos genralmente devolviendo algo de su estructura interna (atributos), mientras que el hijo "Compuesto" tiene una lista de hijos "simples" (*definido como tipo `Componente`*), e implementa los métodos iterando sobre cada uno de sus hijos. (*Por eso es del tipo Componente, porque pueden haber tanto elementos simples como elementos compuestos*).

> para que el `.equals` funcione dentro una clase Compuesta por ejemplo debemos sobreescribirlo o bien en la clase componente o bien en sus hijas.

> Una clase va a ser abstracta en vez de interfaz cuando no la podemos definir como una generalidad, como en los ejmplos de filtro que tenia distintos parametros según los elementos que le pasamos para filtrar, a diferencia del comparador.
>

## Metodos:

```java
//dentro de la clase compuesta
    public int cantEmpleados(){
        int cantTotal = 0;
        for(ElementoEmpresa e : elementos){
            int cantParcial = e.cantEmpleados();//si es otro grupo, almacenamos la cantidad de este
            cantTotal += cantTotal + cantParcial; 
        }

        return cantTotal;
    }


    public ArrayList<Empleado> empleadosCon(String especialidad){
        ArrayList<Empleado> empleadosConEspecialidad = new ArrayList<>();
        for(ElementoEmpresa e : elementos){
            ArrayList<Empleado> resParcial = e.empleadosCon(especialidad);
            for(Empleado emp: resParcial){
                empleadosConEspecialidad.add(emp);
            }
        }
    /*
    O más facíl:
        for(ElementoEmpresa e : elementos){
            empleadosConEspecialidad.addAll(e.empleadoCon(especialidad));
        }
    */


   //En la clase empleado
   public ArrayList<Empleado> empleadosCon(String especiaidad){
    ArrayList<Empleado> empleados = new ArrayList<>();
    if(this.getEspecialidad().equals(espcecialidad)){
        empleados.add(this);
    }
    return empleados; 
   }


    }
```

## Comparators:

1. Creamos un paquete Comparadores
```java
```