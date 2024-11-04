package fotos;

public class AlbumRestringido extends Album{
    private int maxFotos;

    public AlbumRestringido(String titulo, int maxFotos) {
        super(titulo);
        this.maxFotos = maxFotos;
    }

    @Override
    public void addElemento (ElementoFoto nuevoElem){
        if (this.contarFotos()+nuevoElem.contarFotos()<=maxFotos)
            super.addElemento(nuevoElem);
    }

    private Album crearAlbum() {
        return new AlbumRestringido(this.getTitulo(), this.maxFotos);
    }
}
