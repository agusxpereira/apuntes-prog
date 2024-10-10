package series;

public class Temporada {
    private int cantEpisodios;
    private Episodio[] episodios;

    public Temporada(int cant){
        this.cantEpisodios = cant;
        this.episodios = new Episodio[cant];
    }


    public int getCantEpisodios() {
        return cantEpisodios;
    }
    public void setCantEpisodios(int cantEpisodios) {
        this.cantEpisodios = cantEpisodios;
    }
    public Episodio[] getEpisodios() {
        return episodios;
    }
    public void setEpisodios(Episodio[] episodios) {
        this.episodios = episodios;
    }

    public void addEpisodio(int pos, String nombre, String descripcion){
        this.episodios[pos] = new Episodio(nombre, descripcion);
    }

    public Episodio getEpisodio(int pos){
        return episodios[pos-1];
    }
}
