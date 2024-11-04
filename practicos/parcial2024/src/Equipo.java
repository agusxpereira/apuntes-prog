import java.util.ArrayList;

public class Equipo extends ElementoVentas {

	protected ArrayList<ElementoVentas> els;

	public Equipo() {
		els = new ArrayList<ElementoVentas>();
	}
	
	public void addElemento(ElementoVentas ee) {
		els.add(ee);
	}

	@Override
	public int getCantidadVentas() {
		int suma = 0;
		for(int i=0; i<els.size();i++) {
			suma = suma + els.get(i).getCantidadVentas();
		}
		return suma;
	}

	@Override
	public int getCantidadProductos() {
		int suma = 0;
		for(int i=0; i<els.size();i++) {
			suma = suma + els.get(i).getCantidadProductos();
		}
		return suma;
	}

	@Override
	public double getGanacias() {
		double suma = 0;
		for(int i=0; i<els.size();i++) {
			suma = suma + els.get(i).getGanacias();
		}
		return suma;
	}

	@Override
	public double getEdad() {
		double suma = 0;
		for(int i=0; i<els.size();i++) {
			suma = suma + els.get(i).getEdad();
		}
		if (els.size()>0)
		   return suma/els.size();
		else {
			return 0;
		}
	}

	@Override
	public ArrayList<Vendedor> buscar(Condicion c) {
		ArrayList<Vendedor> salida = new ArrayList<Vendedor>();
		for(int i =0; i< els.size(); i++) {
			ElementoVentas aux = els.get(i);
			salida.addAll(aux.buscar(c));
		}
		return salida;
	}
	
	
}
