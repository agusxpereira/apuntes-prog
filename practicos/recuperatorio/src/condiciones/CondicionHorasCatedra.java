package condiciones;

import base.OfertaAcademica;

public class CondicionHorasCatedra extends Condicion {
    private double horasMaximas;

    public CondicionHorasCatedra(double horasMaximas) {
        this.horasMaximas = horasMaximas;
    }


    @Override
    public boolean cumple(OfertaAcademica ofertaAcademica) {
        return ofertaAcademica.cantidadHoras() < horasMaximas;
    }
}
