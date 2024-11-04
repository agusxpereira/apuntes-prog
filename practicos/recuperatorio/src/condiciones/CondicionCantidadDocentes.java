package condiciones;

import base.OfertaAcademica;

public class CondicionCantidadDocentes extends Condicion {
    private double cantDocentesMax;

    public CondicionCantidadDocentes(double cantDocentesMax) {
        this.cantDocentesMax = cantDocentesMax;
    }

    @Override
    public boolean cumple(OfertaAcademica ofertaAcademica) {
        return ofertaAcademica.cantidadDocentes() <= cantDocentesMax;
    }
}
