public class DadoCargado extends Dado{

    private int ladoCargado;
    private double prob;
    public double getProb() {
        return prob;
    }

    public void setProb(double prob) {
        this.prob = prob;
    }

    public DadoCargado(int cantCaras, int ladoCargado){
        super(cantCaras);
        this.ladoCargado = ladoCargado;
        this.prob = 0.5;
    }
    public DadoCargado(int cantCaras, int ladoCargado, double prob){
        super(cantCaras);
        this.ladoCargado = ladoCargado;
        this.prob = prob;
    }

    public int tirar(){
        if(Math.random()>prob){
            return super.tirar();//la mitad de las veces es al azar
        }else{
            return ladoCargado;
        }
    }
}
