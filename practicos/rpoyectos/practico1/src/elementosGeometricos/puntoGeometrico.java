package elementosGeometricos;

public class puntoGeometrico {
    private int x;
    private int y;

    public puntoGeometrico(){
        this.x = 0;
        this.y = 0;
    }

    public void desplazar(int x, int y){
        if(x > this.x){
            this.x = this.x + x;
        }else{
            this.x = this.x - x;

        }
        if(y > this.y){
            this.y = this.y + y;
        }else{
            this.y = this.y - y;

        }

    }

    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }

    public double distanciaEu(int x, int y){
        int x1 = this.x;
        int y1 = this.y;

        int x2 = x;
        int y2 = y;

        double distancia = (Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        return Math.pow(distancia,2);
    }
}
