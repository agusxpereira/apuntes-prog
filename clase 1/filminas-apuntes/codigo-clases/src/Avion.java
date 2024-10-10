
public class Avion {

	private String color;
	private int capacidad;
	private String estado;
	
	
	
	
	
	
	public Avion(String color, int capacidad) {
		setColor(color);
		this.setCapacidad(capacidad);
		setEstado("En Tierra");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
	   if (capacidad < 30) {
	      this.capacidad = 30;
	   } else {
	   
		this.capacidad = capacidad;
	   }
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
