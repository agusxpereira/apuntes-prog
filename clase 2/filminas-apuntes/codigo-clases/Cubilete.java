public class Cubilete {
    Dado d1;
    Dado d2;

    public int tirar(){
        return d1.tirar() + d2.tirar();
    }
    
}

/*Ahora que tenemos un cubilete, podemos por ejemplo tirar 5 dados sin que sea la responsabilidad del jugador tener 5 dados y tirarlos, ya que este le indica al cubilete que tire sus dado, y no sabe ni le interesa cuantos tenga */
