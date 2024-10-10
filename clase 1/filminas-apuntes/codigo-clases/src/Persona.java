
public class Persona {
   String nombre;
   int edad;
   String apellido;
   
   Persona progenitor;

   public Persona(String nn, int ed) {
	   nombre = nn;
	   edad = ed;
   }
   
   public Persona( String nn2) {
	   nombre = nn2;
	   edad = 0;
   }
   
   
   public void setEdad(int e) {
	   edad = e;
   }
   
   public int getEdad() {
	   return edad;
   }
   
   public String getNombre() {
	   return nombre;
   }
   
   public void setNombre(String nn) {
	   this.nombre = nn;
   }

public String getApellido() {
	String aux = apellido;
	if (progenitor!= null) {
		aux = aux  +" " 
	               + progenitor.getApellido();
	}
	
	return aux;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}
   
   
   
}
