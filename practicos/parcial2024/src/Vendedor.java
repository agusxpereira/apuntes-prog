import java.time.LocalDate;
import java.util.ArrayList;

public class Vendedor extends ElementoVentas {

	private String nombre;
	private String apellido;
	private int edad;
	ArrayList<Venta> ventas;
	
	
	
	public Vendedor(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		ventas = new ArrayList<Venta>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void addVenta(Venta v1) {
		//if (!ventas.contains(v1)) //EQUALS EN VENTA
			ventas.add(v1);
	}
	@Override
	public int getCantidadVentas() {
		return ventas.size();
	}
	@Override
	public int getCantidadProductos() {
		int suma = 0;
		for(int i=0; i<ventas.size();i++) {
			suma = suma + ventas.get(i).getCantidad();
		}
		return suma;
	}
	@Override
	public double getGanacias() {
		double suma = 0;
		for(int i=0; i<ventas.size();i++) {
			suma = suma + ventas.get(i).getGanancias();
		}
		return suma;	}
	@Override
	public ArrayList<Vendedor> buscar(Condicion c) {
		ArrayList<Vendedor> salida = new ArrayList<Vendedor>();
		if (c.cumple(this)) {
			salida.add(this);
			
		}
		return salida;
	}
	
	
	public ArrayList<Venta> getVentas(){
		return new ArrayList<Venta>(ventas);
	}
	
	public boolean vendisteAlgo(LocalDate fi, LocalDate ff) {
		for(int i =0; i<ventas.size();i++) {
			
			if (ventas.get(i).getFecha().compareTo(ff)<=0 &&
				ventas.get(i).getFecha().compareTo(fi)>=0	)
				return true;
		}
		 
			return false;
	}
	public boolean vendisteA(String code) {
		for(int i =0; i<ventas.size();i++) {
			
			if (ventas.get(i).getCodigo().equals(code)	)
				return true;
		}
		 
			return false;
	}
}
