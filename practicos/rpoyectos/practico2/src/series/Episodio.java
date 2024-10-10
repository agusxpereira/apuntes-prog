package series;

public class Episodio {

    private String titulo;
    private String descripcion;
    private Boolean visto;
    private int calificacion;

    public Episodio(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = false;
        this.calificacion = -1;
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
    public Boolean getVisto() {
        return visto;
    }
    public void setVisto(Boolean visto) {
        this.visto = visto;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        if(this.visto == false){
            this.calificacion = -1;
            return;
        }
        if(calificacion <= 5){
            this.calificacion = calificacion;
        }else{
            this.calificacion = 1;
        }
    }

    


}
