package condiciones;

import base.OfertaAcademica;

public class CondicionPalabraClave extends Condicion {
    private String palabraNecesaria;

    public CondicionPalabraClave(String palabraNecesaria) {
        this.palabraNecesaria = palabraNecesaria;
    }

    @Override
    public boolean cumple(OfertaAcademica ofertaAcademica) {
        return ofertaAcademica.contienePalabra(palabraNecesaria);
    }
}
