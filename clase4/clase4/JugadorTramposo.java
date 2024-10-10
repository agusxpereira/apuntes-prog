public class JugadorTramposo extends Jugador{
    private DadoCargado d1;
    private DadoCargado d2;

    
    public JugadorTramposo(String nombre){
        super(nombre);
        d1 = new DadoCargado(6, 6);
        d2 = new DadoCargado(6, 5);
    }

    public void setD2(DadoCargado d2) {
        this.d2 = d2;
    }

    public DadoCargado getD2() {
        return d2;
    }
    public DadoCargado getD1() {
        return d1;
    }

    public void setD1(DadoCargado d1) {
        this.d1 = d1;
    }

    public int tirarDados(Cubilete cub){
        //sacamos los dados viejos
       Dado viejo1 = cub.getDadoEn(0);
       Dado viejo2 = cub.getDadoEn(1);
        //agregagmos nuestros dados
        cub.setDadoEn(0, getD1());
        cub.setDadoEn(1, getD2());
        //tiramos los dados cargados
        int tirada = cub.tirar();
        //volvemos a poner los dados
        cub.setDadoEn(0, viejo1);
        cub.setDadoEn(1, viejo2);
        return tirada;

    }

}
