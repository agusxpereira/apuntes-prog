
public class Rectangulo extends Figura{

	double lado1;
	double lado2;
	
	public Rectangulo(double d1, double d2) {
		super("Rectangulo");
		this.setNombre("rectangulo");
		lado1= d1;
		lado2=d2;
	}
	
	public Rectangulo(String nombre, double d1, double d2) {
		super(nombre);
		lado1= d1;
		lado2=d2;
	}
	
	public void setLado1(double l1) {
		lado1 = l1;
	}
	public double getLado1() {
		return lado1;
	}
	
	public void setLado2(double l2) {
		lado2 = l2;
	}
	public double getLado2() {
		return lado2;
	}
	
	public double getArea() {
		return lado1*lado2;
	}
	
	public double getPerimetro() {
		return lado1*2+lado2*2;
	}
}
