package base;

import condiciones.Condicion;

import java.util.ArrayList;

public abstract class OfertaAcademica {
    private String nombre;

    public OfertaAcademica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPrecio();

    public abstract int cantidadCursos();

    public abstract int cantidadHoras();

    public abstract ArrayList<String> getDocentes();

    public abstract ArrayList<String> getPalabrasClave();

    public abstract ArrayList<Curso> buscar(Condicion filtro);

    public abstract Curso cursoMasCaro();

    public boolean contienePalabra(String palabra) {
        return this.getPalabrasClave().contains(palabra);
    }

    public int cantidadDocentes() {
        return this.getDocentes().size();
    }
}
