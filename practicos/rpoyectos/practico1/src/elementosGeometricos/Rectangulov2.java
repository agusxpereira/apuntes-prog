package elementosGeometricos;

public class Rectangulov2 {
    private puntoGeometrico vertice; //un vértice del rectangulo
    private double longitudLado1;
    private double longitudLado2;

    public Rectangulov2 (puntoGeometrico p1, puntoGeometrico p2, puntoGeometrico p3, puntoGeometrico p4){
        this.vertice = p1;
        this.longitudLado1 = Math.abs(p2.getX() - p1.getX());
        this.longitudLado2 = Math.abs(p3.getY() - p1.getY());
    }


    public Rectangulov2 (puntoGeometrico vertice, double longitudLado1, double longitudLado2){
        this.vertice = vertice;
        this.longitudLado1 = longitudLado1;
        this.longitudLado2 = longitudLado2;
    }


    public puntoGeometrico getVertice() {
        return vertice;
    }


    public void setVertice(puntoGeometrico vertice) {
        this.vertice = vertice;
    }


    public double getLongitudLado1() {
        return longitudLado1;
    }


    public void setLongitudLado1(double longitudLado1) {
        this.longitudLado1 = longitudLado1;
    }


    public double getLongitudLado2() {
        return longitudLado2;
    }


    public void setLongitudLado2(double longitudLado2) {
        this.longitudLado2 = longitudLado2;
    }

    
}
