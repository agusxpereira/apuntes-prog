
public class EquipoPeterPan extends Equipo {

	
	public double getEdad() {
		double menor = 0;
		if (els.size()>0) {
			menor = els.get(0).getEdad();
		}
		for(int i=1; i<els.size();i++) {
			double aux = els.get(i).getEdad();
			if (aux<menor) {
				menor = aux;
			}
		}
         return menor;  
	}
}
