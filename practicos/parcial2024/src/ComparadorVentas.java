import java.util.Comparator;

public class ComparadorVentas implements Comparator<ElementoVentas> {


	public int compare(ElementoVentas o1, ElementoVentas o2) {
		int v1 = o1.getCantidadVentas();
		int v2 = o2.getCantidadVentas();
		return v1-v2;
	}

}
