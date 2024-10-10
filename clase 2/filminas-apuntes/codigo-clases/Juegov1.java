public class Juegov1{
    private int puntos1;
    private int puntos2;

    public Juegov1(){
        puntos1=0;
        puntos2=0;
    }

    public void jugar(){
        for(int i = 0; i<10; i++){
            int suma1 = this.tirarDado() + this.tirarDado();
            int suma2 = this.tirarDado() + this.tirarDado();
            
            if(suma1 > 7 && suma1>suma2){
                puntos1++;
            }else if(suma2 > 7 && suma2>suma1){
                puntos2++;
            }
        } 
    }

    //desde afuera no se puede tirar dados si lo hacemos private
    public int tirarDado(){
        return (int) (Math.random()*6) + 1;
    }

    public String ganador(){
        if(puntos1 > puntos2){
            return "gano el jugador 1";
        }else if(puntos2 > puntos1){
            return "gano el jugador 2";
        }else{
            return "empate";
        }
    }

    public static void main(String[] args) {
        Juegov1 juego1 = new Juegov1();
        juego1.jugar();


        Jugador j1 = new Jugador("Agus");
        Jugador j2 = new Jugador("Santi");
        
        /*Acá podriamos hacer algo como lo siguietne:
         * Dado d1 = new Dado(10);
         * Dado d2 = new Dado(6);
         * y 
         * JuegoPOO juego = new JuegoPOO(j1, j2, d1, d2);
         * 
         * Gracias a los contructores podemos permitir estas cosas
         */


        JuegoPOO juego = new JuegoPOO(j1, j2, 10);
        juego.setRondas(300);
        juego.jugar();
    
    }

}
