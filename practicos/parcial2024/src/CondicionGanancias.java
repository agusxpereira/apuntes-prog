
public class CondicionGanancias extends Condicion {

	double max;
	@Override
	public boolean cumple(Vendedor vv) {
		// TODO Auto-generated method stub
		return vv.getGanacias()<max;
	}

}
