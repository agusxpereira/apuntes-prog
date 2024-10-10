
public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c1 = new Circulo(10);
		Figura3D fc1 = new Figura3D("Cilindro", 10, c1);
		
		System.out.println(fc1.getVolumen());
		System.out.println(fc1.getSuperficie());
		
		Rectangulo r1 = new Rectangulo(10,10);
        Figura3D fr1 = new Figura3D("Prectan", 10, r1);
		
		System.out.println(fr1.getVolumen());
		System.out.println(fr1.getSuperficie());
	
		MedioCirculo mc1 = new MedioCirculo(10);
        Figura3D fmc1 = new Figura3D("MedioCilindro", 10, mc1);
		
		System.out.println(fmc1.getVolumen());
		System.out.println(fmc1.getSuperficie());
	
	
	
	}

}
