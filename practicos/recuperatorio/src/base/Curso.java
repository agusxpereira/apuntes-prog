package base;

import condiciones.Condicion;

import java.util.ArrayList;

public class Curso extends OfertaAcademica {
    private double precio;
    private int cantHoras;
    private ArrayList<String> docentes;
    private ArrayList<String> palabrasClave;

    public Curso(String nombre, double precio, int cantHoras) {
        super(nombre);
        this.precio = precio;
        this.cantHoras = cantHoras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int cantidadCursos() {
        return 1;
    }

    @Override
    public int cantidadHoras() {
        return cantHoras;
    }

    public void addDocente(String docente) {
        if (!docentes.contains(docente))
            docentes.add(docente);
    }

    @Override
    public ArrayList<String> getDocentes() {
        return new ArrayList<>(this.docentes);
    }

    public void addPalabraClave(String palabra) {
        if (!palabrasClave.contains(palabra))
            palabrasClave.add(palabra);
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(this.palabrasClave);
    }

    @Override
    public ArrayList<Curso> buscar(Condicion filtro) {
        ArrayList<Curso> retorno = new ArrayList<>();
        if (filtro.cumple(this))
            retorno.add(this);
        return retorno;
    }

    @Override
    public Curso cursoMasCaro() {
        return this;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }
}
