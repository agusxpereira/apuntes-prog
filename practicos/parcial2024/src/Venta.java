import java.time.LocalDate;

public class Venta {
/*
 * De cada venta se registra la fecha, 
 * el código del producto, el dni del comprador, 
 * el monto al que se vendió y la cantidad vendida 
 * de ese producto. Las ganancias por una venta 
 * se calculan como el monto al que se vendió el producto,
 *  por la cantidad de productos vendidos. 
 */
	private LocalDate fecha;
	private String codigo;
	private int dni;
	private double monto;
	private int cantidad;
	public Venta(LocalDate fecha, String codigo, int dni, double monto, int cantidad) {
		super();
		this.fecha = fecha;
		this.codigo = codigo;
		this.dni = dni;
		this.monto = monto;
		this.cantidad = cantidad;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double getGanancias() {
		return cantidad*monto;
	}
}
