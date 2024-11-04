package fotos;

import java.util.ArrayList;
import java.util.HashSet;

public class Fotografia extends ElementoFoto{
    private int id;
    private double peso;
    private ArrayList<String> personas;

    public Fotografia(String titulo, int id, double peso) {
        super(titulo);
        this.id = id;
        this.peso = peso;
        this.personas = new ArrayList<>();
    }

    public void addPersona(String persona){
        if (!personas.contains(persona))
            this. personas.add(persona);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public int contarFotos() {
        return 1;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<String> getPersonas() {
        return new ArrayList<>(personas);
    }

    @Override
    public ElementoFoto copia(Condicion cond) {
        if (cond.cumple(this)) {
            Fotografia copia = new Fotografia(this.getTitulo(), this.id, this.peso);
            for (String persona : personas)
                copia.addPersona(persona);
            return copia;
        }
        return null;
    }

    @Override
    protected HashSet<String> getPersonasConConjunto() {
        return new HashSet<>(personas);
    }

    public boolean apareceFulanito(String personaBuscada) {
        return this.personas.contains(personaBuscada);
    }
}
