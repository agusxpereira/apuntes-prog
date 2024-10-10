public class Cubilete {
    private Dado[] dados;

    public Cubilete(int cantDados){
        dados = new Dado[cantDados];
        for(int i=0; i< dados.length; i++){
            dados[i] = new Dado(6);
        }
    }
    public Cubilete(int cantDados, int cantCaras){
        dados = new Dado[cantDados];
        for(int i=0; i< dados.length; i++){
            dados[i] = new Dado(cantCaras);
        }
    }

    public Dado getDadoEn(int pos){
        if(pos > 0 && pos < dados.length)
            return dados[pos];
        else
            return null;
    }

    public void setDadoEn(int pos, Dado d1){
        if(pos > 0 && pos < dados.length)
            dados[pos] = d1;
    }


    public int tirar(){
        int cantTotal = 0;

        for(int i = 0; i<dados.length; i++){
            cantTotal += dados[i].tirar();
        }
        return cantTotal;
    }
}
