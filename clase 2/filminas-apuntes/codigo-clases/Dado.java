public class Dado {
    private int cantCaras;
    private int ultimoValor;


    public Dado(){
        cantCaras = 6;
        tirar();
    }

    public Dado(int cantCaras){
        this.cantCaras = cantCaras;
        tirar();
    }

    public int tirar(){
        ultimoValor = (int) (Math.random()*6) + 1;
        return ultimoValor;
    }

    public int getCantCaras() {
        return cantCaras;
    }

    

    public int getUltimoValor() {
        return ultimoValor;
    }

    

    
}
