
public class CondicionCodigo extends Condicion {

	String codigo;
	public boolean cumple(Vendedor vv) {
		// TODO Auto-generated method stub
		return vv.vendisteA(codigo);
	}

}
