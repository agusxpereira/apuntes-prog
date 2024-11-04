package fotos;

import java.time.LocalDate;

public class CondicionFecha extends Condicion{
    private LocalDate fechaLimite;

    public CondicionFecha(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Override
    public boolean cumple(Fotografia foto) {
        return foto.getFecha().compareTo(this.fechaLimite) > 0;
    }
}
