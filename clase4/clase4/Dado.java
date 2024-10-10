public class Dado {
    private int cantCaras;
    private int ultimoValor;

    public Dado(int cantCaras){
        this.cantCaras = cantCaras;
    }

    public int tirar(){
        this.ultimoValor = (int) ((Math.random() + 1) * this.getCantCaras());
        return ultimoValor;
    }

    public int getCantCaras() {
        return cantCaras;
    }

    public void setCantCaras(int cantCaras) {
        this.cantCaras = cantCaras;
    }

    public int getUltimoValor() {
        return ultimoValor;
    }


}
