package series;

public class Serie {
/*private temporadas[];
 * 
*/
    private String titulo;
    private String descripcion;
    private String genero;
    private String creador;

    private Temporada[] temporadas;

    public Serie(String titulo, String descripcion, String genero, String creador, int temporadas){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.creador = creador;
        this.temporadas = new Temporada[temporadas];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setTemporadas(int cant){
        this.temporadas = new Temporada[cant];
    }
    public void addTemporada(int pos, int cantEpisodios){
        this.temporadas[pos] = new Temporada(cantEpisodios);
    }
    public Temporada[] getTemporadas(){
        return temporadas;
    }
    public Temporada getTemporada(int pos){
        return temporadas[pos];
    }
}
