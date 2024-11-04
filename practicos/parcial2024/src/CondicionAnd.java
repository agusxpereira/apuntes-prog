
public class CondicionAnd extends Condicion {
Condicion c1,c2;
	public boolean cumple(Vendedor vv) {
		// TODO Auto-generated method stub
		return c1.cumple(vv) && c2.cumple(vv);
	}

}
