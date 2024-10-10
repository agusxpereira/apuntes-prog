
public class Dado {
   int caras;
   
   public Dado(int c) {
	   this.setCaras(c);
   }
   public Dado() {
	   this(6);
   }
   public void setCaras(int x) {
	   if (x>0) {
		   caras = x;
	   } else {
		   if (x<0) {
			   caras = -x;
		   } else {
			   caras = 2;
		   }
	   }
   }
   
   public int getCaras() {
	   return caras;
	   
   }
   
   public int tirar() {
	   return (int)((Math.random()*this.caras)+1);
   }
}
