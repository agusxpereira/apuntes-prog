package base;

import condiciones.Condicion;

import java.util.ArrayList;

public class Especializacion extends OfertaAcademica {
    private static double maximoDescuento = 0.5; //50%
    private final ArrayList<OfertaAcademica> elementos;
    private double descuento; //2%
    private Condicion filtro;

    public Especializacion(String nombre, double descuento, Condicion filtro) {
        super(nombre);
        this.descuento = descuento;
        this.filtro = filtro;
        this.elementos = new ArrayList<>();
    }

    public static double getMaximoDescuento() {
        return maximoDescuento;
    }

    public static void setMaximoDescuento(double maximoDescuento) {
        Especializacion.maximoDescuento = maximoDescuento;
    }

    public void agregarElemento(OfertaAcademica nuevoElemento) {
        if (filtro.cumple(nuevoElemento))
            elementos.add(nuevoElemento);
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setFiltro(Condicion filtro) {
        this.filtro = filtro;
    }

    protected double getSumaPrecios() {
        double suma = 0;
        for (int i = 0; i < elementos.size(); i++) {
            OfertaAcademica hijo = elementos.get(i);
            suma += hijo.getPrecio();
        }
        return suma;
    }

    @Override
    public double getPrecio() {
        double suma = this.getSumaPrecios();
        double descuento = this.descuento * this.cantidadCursos();
        if (descuento > Especializacion.maximoDescuento)
            descuento = Especializacion.maximoDescuento;
        return suma - suma * descuento;
    }

    @Override
    public int cantidadCursos() {
        int total = 0;
        for (int i = 0; i < elementos.size(); i++) {
            OfertaAcademica hijo = elementos.get(i);
            total += hijo.cantidadCursos();
        }
        return total;
    }

    @Override
    public int cantidadHoras() {
        int total = 0;
        for (int i = 0; i < elementos.size(); i++) {
            OfertaAcademica hijo = elementos.get(i);
            total += hijo.cantidadHoras();
        }
        return total;
    }

    //controlar repetidos
    @Override
    public ArrayList<String> getDocentes() {
        ArrayList<String> retorno = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            OfertaAcademica hijo = elementos.get(i);
            ArrayList<String> docentesHijo = hijo.getDocentes();
            for (String docente : docentesHijo)
                if (!retorno.contains(docente))
                    retorno.add(docente);
        }
        return retorno;
    }

    //controlar repetidos
    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> retorno = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            OfertaAcademica hijo = elementos.get(i);
            ArrayList<String> palabrasHijo = hijo.getPalabrasClave();
            for (String palabra : palabrasHijo)
                if (!retorno.contains(palabra))
                    retorno.add(palabra);
        }
        return retorno;
    }

    @Override
    public ArrayList<Curso> buscar(Condicion filtro) {
        ArrayList<Curso> retorno = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            OfertaAcademica hijo = elementos.get(i);
            retorno.addAll(hijo.buscar(filtro));
        }
        return retorno;
    }

    public Curso cursoMasCaro() {
        Curso cursoMasCaro = null;
        double valorMasCaro = 0;
        for (int i = 0; i < elementos.size(); i++) {
            OfertaAcademica hijo = elementos.get(i);
            Curso cursoMasCaroDelHijo = hijo.cursoMasCaro();
            double valorCursoCaroHijo = cursoMasCaroDelHijo.getPrecio();
            if (valorCursoCaroHijo > valorMasCaro) {
                valorMasCaro = valorCursoCaroHijo;
                cursoMasCaro = cursoMasCaroDelHijo;
            }
        }
        return cursoMasCaro;
    }
}
