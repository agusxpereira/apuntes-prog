
public class JuegoDadosPooCubilete {

	Jugador j1;
	Jugador j2;
	
	Cubilete vasito;
	
	int rondas;
	int minimoPuntos;
	
	public JuegoDadosPooCubilete(Jugador jj1, Jugador jj2) {
		j1 = jj1;
		j2 = jj2;
		vasito = new Cubilete(2,6);
		rondas = 10;
		minimoPuntos = 7;
	}
	
	public JuegoDadosPooCubilete(Jugador jj1, Jugador jj2, Cubilete cc) {
		j1 = jj1;
		j2 = jj2;
		vasito = cc;
		rondas = 10;
		minimoPuntos = 7;
	}
	
	public void setRondas(int rr) {
		rondas = rr;
	}
	public int getRondas() {
		return rondas;
	}
	
	public void setMinimoPuntos(int rr) {
		minimoPuntos = rr;
	}
	public int getMinimoPuntos() {
		return minimoPuntos;
	}
	
	public Jugador  jugar() {
		//NO A LAS CONSTANTES EN CODIGO
		for(int i =0; i< rondas; i++) {
			int t1 = j1.tirarDados(vasito);
			int t2 = j2.tirarDados(vasito);
			if (t1>t2 && t1>=minimoPuntos) {
				j1.sumarPunto();
			} else {
				if (t2>t1 && t2>=minimoPuntos) {
					j2.sumarPunto();
				}
			}
		}
		Jugador gana = ganador();
		
		return gana;
	}
	
	
	
	public Jugador ganador() {
		if (j1.getPuntos() > j2.getPuntos()) {
			return j1;
		} else {
			if (j2.getPuntos() > j1.getPuntos()) {
				return j2;
			} else {
				return null;
			}
		}
	}
	
	

	public static void main(String[] args) {
		Jugador ana = new Jugador("Ana");
		Jugador jose = new Jugador("Jose");
		Cubilete vasoNuevo = new Cubilete(5,30);
		JuegoDadosPooCubilete juego = new JuegoDadosPooCubilete(ana,jose,vasoNuevo);
		juego.setRondas(350);
		juego.setMinimoPuntos(35);
		Jugador ganador = juego.jugar();
		if(ganador!= null) {
			System.out.println("Gano el Jugador "+ ganador.getNombre() + " con "+ ganador.getPuntos());
		} else {
			System.out.println("Empate");
		}
		System.out.println(ana.getNombre() + "--" + ana.getPuntos());
		System.out.println(jose.getNombre() + "--" + jose.getPuntos());
	}
}
