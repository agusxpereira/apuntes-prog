package fotos;

public class CondicionTienePersona extends Condicion{
    private String personaBuscada;
    @Override
    public boolean cumple(Fotografia foto) {
        return foto.apareceFulanito(personaBuscada);
    }
}
