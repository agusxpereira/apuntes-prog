
public class CondicionProductos extends Condicion {

	int cant;
	
	public boolean cumple(Vendedor vv) {
		// TODO Auto-generated method stub
		return vv.getCantidadProductos()<cant;
	}

}
