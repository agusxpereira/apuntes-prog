package fotos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Album extends ElementoFoto{
    private ArrayList<ElementoFoto> elementos;
    public Album(String titulo) {
        super(titulo);
        this.elementos = new ArrayList<>();
    }

    @Override
    public double getPeso() {
        int suma = 0;
        for (ElementoFoto e:elementos)
            suma+=e.getPeso();
        return suma;
    }

    @Override
    public int contarFotos() {
        int suma = 0;
        for (ElementoFoto e:elementos)
            suma+=e.contarFotos();
        return suma;
    }

    @Override
    public ArrayList<String> getPersonas() {
        ArrayList<String> todasLasPersonas = new ArrayList<>();
        for (ElementoFoto e:elementos) {
            ArrayList<String> resultPacial = e.getPersonas();
            for (String persona:resultPacial)
                if (!todasLasPersonas.contains(persona))
                    todasLasPersonas.add(persona);
        }
        return todasLasPersonas;
    }

    @Override
    public ElementoFoto copia(Condicion cond) {
        Album copia = crearAlbum();
        boolean agrego = false;
        for (ElementoFoto elem:elementos){
            ElementoFoto copiaHijo = elem.copia(cond);
            if (copiaHijo != null){
                copia.addElemento(copiaHijo);
                agrego = true;
            }
        }
        if (agrego) //if (copia.contarFotos()>0)
            return copia;
        else
            return null;
    }

    private Album crearAlbum() {
        return new Album(this.getTitulo());
    }

    public HashSet<String> getPersonasConConjunto() {
        HashSet<String> todasLasPersonas = new HashSet<>();
        for (ElementoFoto e:elementos) {
            todasLasPersonas.addAll(e.getPersonasConConjunto());
        }
        return todasLasPersonas;
    }


    public void addElemento (ElementoFoto nuevoElem){
        this.elementos.add(nuevoElem);
        Collections.sort(elementos);
    }
}
