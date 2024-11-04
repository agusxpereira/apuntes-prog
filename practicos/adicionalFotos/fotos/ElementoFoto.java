package fotos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class ElementoFoto implements Comparable<ElementoFoto>{
    private String titulo;
    private LocalDate fecha;

    public ElementoFoto(String titulo) {
        this.titulo = titulo;
        this.fecha = LocalDate.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public abstract double getPeso();
    public abstract int contarFotos();
    public abstract ArrayList<String> getPersonas();
    public abstract ElementoFoto copia(Condicion cond);

    @Override
    public int compareTo(ElementoFoto o) {
        int resul = this.getFecha().compareTo(o.getFecha());
        if (resul == 0)
            return Double.compare(this.getPeso(), o.getPeso());
        return resul;
    }

    protected abstract HashSet<String> getPersonasConConjunto();
}
