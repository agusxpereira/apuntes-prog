import java.time.LocalDate;

public class CondicionVentasEntre extends Condicion{

	LocalDate fi, ff;

	
	public boolean cumple(Vendedor vv) {
		
		return vv.vendisteAlgo(fi, ff);
	}
	
	
}
