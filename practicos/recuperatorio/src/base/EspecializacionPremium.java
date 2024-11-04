package base;

import condiciones.Condicion;

public class EspecializacionPremium extends Especializacion {
    public EspecializacionPremium(String nombre, double descuento, Condicion filtro) {
        super(nombre, descuento, filtro);
    }

    @Override
    public double getPrecio() {
        return this.getSumaPrecios();
    }
}
