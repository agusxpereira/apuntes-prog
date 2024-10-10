
public class MedioCirculo extends Circulo {

	public MedioCirculo(double radio) {
		super(radio);
		
	}
	
	public double getArea() {
		return super.getArea()/2;
	}
	
	public double getPerimetro() {
		return super.getPerimetro()/2+this.getDiametro();
	}
	
	public String getNombre() {
		return "Medio"+super.getNombre();
	}
}
