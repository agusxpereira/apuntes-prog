import java.util.Comparator;

public class ComparadorGanancias implements Comparator<ElementoVentas> {

	@Override
	public int compare(ElementoVentas o1, ElementoVentas o2) {
		double d1 = o1.getGanacias();
		double d2 = o2.getGanacias();
		return Double.compare(d1, d2);
	}

}
