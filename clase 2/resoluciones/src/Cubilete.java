
public class Cubilete {
  int capacidad;
  Dado[] dados;
  
  public  Cubilete() {
	  this(2,6);
  }
  
  public Cubilete(int cap, int caraDados) {
	  capacidad = cap;
	  dados = new Dado[capacidad];
	  for(int i = 0; i<capacidad;i++) {
		  dados[i] = new Dado(caraDados);
	  }
	  
  }
  
  public Dado[] getDados() {
	  return dados;
  }
  
  public void setDados(Dado[] dds) {
	  dados = dds;
	  capacidad = dds.length;
  }
  
  
  public int tirar() {
	  int suma = 0;
	  for (int i =0; i< dados.length;i++) {
		  suma = suma + dados[i].tirar();
	  }
	  return suma;
  }
  
  
}
