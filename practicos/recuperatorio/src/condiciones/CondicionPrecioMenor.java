package condiciones;

import base.OfertaAcademica;

public class CondicionPrecioMenor extends Condicion {
    private double precioMaximo;

    public CondicionPrecioMenor(double precioMaximo) {
        this.precioMaximo = precioMaximo;
    }

    @Override
    public boolean cumple(OfertaAcademica ofertaAcademica) {
        return ofertaAcademica.getPrecio() < precioMaximo;
    }
}
