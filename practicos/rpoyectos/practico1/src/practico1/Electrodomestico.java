package practico1;

public class Electrodomestico {
    private String nombre; 
    private String color;
    private double precio;
    private double consumo;
    private double peso;
    
    public Electrodomestico(String nombre){
        this.nombre = nombre;
        this.color = "Gris";
        this.precio = 100.0;
        this.consumo = 10.0;
        this.peso = 2.0;
    }
    public Electrodomestico(String nombre, String color, double precio, double consumo, double peso){
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.consumo = consumo;
        this.peso = peso;
    }
    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getConsumo() {
        return consumo;
    }
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    } 

    public Boolean esBajoConsumo(){
        if(this.getConsumo() < 45.0){
            return true;
        }else{
            return false;
        }
    }

    public double balance(){
        return this.getPrecio() / this.getPeso();
    }
    public Boolean esAltaGama(){
        if(this.balance() > 3.0){
            return true;
        }else{
            return false;
        }
    }
}
