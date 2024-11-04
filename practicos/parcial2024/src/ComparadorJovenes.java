import java.util.Comparator;

public class ComparadorJovenes implements Comparator<ElementoVentas> {

	@Override
	public int compare(ElementoVentas o1, ElementoVentas o2) {
		int v1 = o1.getCantidadVentas();
		int v2 = o2.getCantidadVentas();
		return Double.compare(v1/o1.getEdad(), v2/o2.getEdad());
	}

}
