public class Jugador {
    private int puntos;
    private String nombre;

    public Jugador(String nombre){
        this.nombre = nombre;
        puntos = 0;
    }

    public int getPuntos() {
        return puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    

    public void incrementarPuntos(){
        this.puntos++;
    }


    public int tirarDado(Dado d1, Dado d2){
        int sum1 = d1.tirar() + d2.tirar();
        int sum2 = d1.tirar() + d2.tirar();
        
        if(sum1 > sum2){
            return sum1;
        }else{
            return sum2;
        }
    }
}
