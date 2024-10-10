
public class Perro {
  String nombre;
  String raza;
  int edad;
  private Perro() {
	  nombre = "toby";
	  raza = "pp";
	  edad = 0;
  }
  public Perro(String nn) {
	  this();
	  setNombre(nn);
	  
  }
  
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	if (nombre != null)
		this.nombre = nombre;
}
public String getRaza() {
	return raza;
}
public void setRaza(String raza) {
	this.raza = raza;
}
public int getEdad() {
	return edad;
}
public void sumarEdad() {
	edad++;
}


 public static void main(String[] args) {
	 Perro p1 = new Perro();
	 p1.setNombre(null);
	 System.out.println(p1.getNombre());
	 System.out.println(p1.getRaza());
	 System.out.println(p1.getEdad());
	 
 }
  
 
 public String toString() {
	 return "Perro("+nombre+","+raza+","+edad+")";
 }
}
