
public class Ejecutable {

	public static void main(String[] args) {
	  
		int x = 3;
		System.out.println(x);
		Persona a=new Persona("Roque",45);
		System.out.println(a);
		//a.setNombre("Ana");
		System.out.println(a.getNombre());
		
		System.out.println(a.getEdad());
		a = new Persona("JJJ");
		System.out.println(a);
		a.getEdad();
		Persona b = a;
		System.out.println(b);
		a.setNombre("Juan");
		System.out.println(a.getNombre());
		System.out.println(b.getNombre());
		b.setNombre("Juancito");
		System.out.println(a.getNombre());
		
		
		String ss = "hola";
	
		
		
		Avion a1 = new Avion("Blanco",-5);
		System.out.println(a1.getCapacidad());
		
		//NUNCA JAMAS a1.capacidad = -50;
		
		System.out.println(a1.getCapacidad());
		
		
		Persona[] personitas = new Persona[34];
		personitas[0]= new Persona("Ana");
		System.out.println(personitas[0]);
	}

}
