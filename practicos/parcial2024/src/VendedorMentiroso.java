
public class VendedorMentiroso extends Vendedor {

	int mentira=2;//GET Y SET
	
	public VendedorMentiroso(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		// TODO Auto-generated constructor stub
	}
	
	public double getGanancias() {
		return super.getGanacias()*mentira;
	}

}
