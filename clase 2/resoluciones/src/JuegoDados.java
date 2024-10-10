
public class JuegoDados {

	int puntos1;
	int puntos2;
	
	public JuegoDados() {
		puntos1=0;
		puntos2=0;
	}
	
	public void jugar() {
		
		for(int i =0; i< 10; i++) {
			int t1 = tirarDado() + tirarDado();
			int t2 = tirarDado() + tirarDado();
			if (t1>t2 && t1>=7) {
				puntos1++;
			} else {
				if (t2>t1 && t2>=7) {
					puntos2++;
				}
			}
		}
		int gana = ganador();
		if (gana== 1) {
			System.out.println("Gano el jugador 1");
			
		} else {
			if (gana == 2) {
				System.out.println("Gano el jugador 2");
						
			} else {
				System.out.println("Empate");
			}
		}
	}
	
	public int tirarDado() {
		return (int)((Math.random()*6)+1);
	}
	
	public int ganador() {
		if (puntos1 > puntos2) {
			return 1;
		} else {
			if (puntos2 > puntos1) {
				return 2;
			} else {
				return 0;
			}
		}
	}
	
	
	
}
