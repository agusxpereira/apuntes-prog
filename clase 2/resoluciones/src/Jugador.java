
public class Jugador {

	String nombre;
	int puntos;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		puntos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}
	
	public void sumarPunto() {
		puntos++;
	}
	
	public int tirarDados(Cubilete cc) {
		return cc.tirar();
	}
	
	public int tirar(Dado d1, Dado d2) {
		return d1.tirar()+d2.tirar();
	}
}
