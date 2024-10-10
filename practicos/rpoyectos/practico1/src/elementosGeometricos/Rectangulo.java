package elementosGeometricos;

public class Rectangulo {
    private puntoGeometrico verticeInferior;//un punto xy, Izquierdo
    private puntoGeometrico verticeSuperior;// un punto xy, Derecho

    public void desplazar(int x, int y){
        this.verticeInferior.desplazar(x, y);
        this.verticeSuperior.desplazar(x, y);
    }


    public int getArea(){
        int ancho = this.verticeSuperior.getX() - this.verticeInferior.getX();
        int alto = this.verticeSuperior.getY() - this.verticeInferior.getY();

        int area = ancho * alto;
        return area;
    }

    public int comparar(int area){
        if(this.getArea() < area){
            return -1;
        }else if(this.getArea()> area){
            return 1;
        }
        return 0;
    }

    public Boolean esCuadrado(){
        int ancho = this.verticeSuperior.getX() - this.verticeInferior.getX();
        int alto = this.verticeSuperior.getY() - this.verticeInferior.getY();

        return ancho == alto;
    }

    public int largoLadoSuperior(){
        
        int largoSuperior = this.verticeSuperior.getX() - this.verticeInferior.getX();
        
        return largoSuperior;
    }

    public Boolean estaAcostado(){
        int ancho = this.verticeSuperior.getX() - this.verticeInferior.getX();
        int alto = this.verticeSuperior.getY() - this.verticeInferior.getY();

        return alto > ancho;
    }

}
