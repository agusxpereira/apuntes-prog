
public class Figura {
   String nombre;

  public Figura(String nombre) {
	
	this.nombre = nombre;
  }
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
  
	public double getArea() {
		return 0;// a futuro lo mejoramos
	}
	
	public double getPerimetro() {
		return 0;
	}
  
  
	public String getDatosCompletos() {
		return this.getNombre()+"("+this.getArea()+","+this.getPerimetro()+")";
	}
}
