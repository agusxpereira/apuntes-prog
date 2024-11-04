import java.util.ArrayList;

public abstract  class ElementoVentas {

	
	public abstract int getCantidadVentas();
	public abstract int getCantidadProductos();
	public abstract double getGanacias();
	public abstract double getEdad();
	
	public abstract ArrayList<Vendedor> buscar(Condicion c);
}
