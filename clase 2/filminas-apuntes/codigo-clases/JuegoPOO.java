public class JuegoPOO {
    Dado d1;
    Dado d2;

    Jugador j1;
    Jugador j2;

    int rondas;
    int minimo;

    public JuegoPOO(Jugador j1, Jugador j2, Dado d1, Dado d2){
        this.j1 = j1;
        this.j2 = j2;

        this.d1=d1;
        this.d2=d2;

        this.rondas = 10;
        this.minimo = 7;
    }

    public JuegoPOO(Jugador j1, Jugador j2, int rondas, int minimo){
        this(j1, j2, new Dado(6), new Dado(6));
        this.rondas = rondas;
        this.minimo = minimo;
    }

    public JuegoPOO(Jugador j1, Jugador j2, int cantCaras){
        this(j1, j2, new Dado(cantCaras), new Dado(cantCaras));
    }

    public void jugar(){
        for(int i = 0; i<rondas; i++){
            int suma1 = j1.tirarDado(d1, d2);//Acá iria el cubilete
            int suma2 = j2.tirarDado(d1, d2);
            
            if(suma1 > minimo && suma1>suma2){
                j1.incrementarPuntos();
            }else if(suma2 > 7 && suma2>suma1){
                j2.incrementarPuntos();
            }

            Jugador ganador = ganador();
            if(ganador!=null){
                System.out.println("El ganador es:" + ganador.getNombre());
                System.out.println(j1.getNombre() + " - " + j1.getPuntos() + 
                                    " @ " + j2.getNombre() + " - " + j2.getPuntos());
            }else{
                System.out.println("Empate");
            }
        } 
    }



    public Jugador ganador(){
        if(j1.getPuntos() > j2.getPuntos()){
            return j1;
        }else if(j1.getPuntos() < j2.getPuntos()){
            return j2;
        }else{
            return null;
        }

        
    }

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }
    
}
