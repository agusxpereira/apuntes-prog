package condiciones;

import base.OfertaAcademica;

public class CondicionAND extends Condicion {
    Condicion c1, c2;

    public CondicionAND(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(OfertaAcademica ofertaAcademica) {
        return c1.cumple(ofertaAcademica) && c2.cumple(ofertaAcademica);
    }


}
