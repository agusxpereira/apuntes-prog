package practico1;


import java.time.LocalDate;
import java.time.Month;

public class Persona {
    private String name;
    private String lastname;
    private int age;
    private LocalDate birthDate;
    private String dni;
    private String gender;
    private double weight;
    private double height;


    public Persona(String dni){
        name = "N";
        lastname = "N";
        age = 1;
        birthDate =  LocalDate.of(2000, Month.JANUARY, 1);
        this.dni = dni;
        gender = "Female";
        weight = 1;
        height = 1;
        //this("N", "N", dni, "1/1/2000");

    }

    public Persona(String name, String lastname, String dni){
        this.name = name;
        this.lastname = lastname;
        age = 1;
        birthDate = LocalDate.of(2000, Month.JANUARY, 1);
        this.dni = dni;
        gender = "Female";
        weight = 1;
        height = 1;
    }

    public Persona(String name, String lastname, String dni, LocalDate birthDate){
        this.name = name;
        this.lastname = lastname;
        age = 1;
        birthDate =  LocalDate.of(2000, Month.JANUARY, 1);
        this.dni = dni;
        gender = "Female";
        weight = 1;
        height = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getDni() {
        return dni;
    }

  

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getImc(){
        double imc = (this.getWeight() / this.getHeight() * this.getHeight());
        return imc;
    }

    public Boolean isWelth(){
        if((this.getImc() > 18.5) && (this.getImc() < 25.0) ){
            return true;
        }else{
            return false;
        }
    }

    public Boolean isBirthday(){
        LocalDate currentDate = LocalDate.now(); 
        int montOfBirth = this.getBirthDate().getMonthValue();
        int dayOfBirth = this.getBirthDate().getDayOfMonth();

        int currentMont = currentDate.getMonthValue();
        int currentDay = currentDate.getDayOfMonth();

        if((currentDay == dayOfBirth) && (currentMont == montOfBirth)){
            return true;
        }else{
            return false;
        }
    }

    public Boolean esMayor(){
        if(this.age > 18){
            return true;
        }else{
            return false;
        }
    }

    public Boolean puedeVotar(){
        if(this.getAge() > 16){
            return true;
        }else{
            return false;
        }
    }

    public Boolean edadCoherente(){
        LocalDate currentDate = LocalDate.now();
        int currentAge = currentDate.getYear() - this.getBirthDate().getYear();

        if(currentAge == this.getAge()){
            return true;
        }else{
            return false;
        }
    }

    public String convertToString(){

        String dataObj = "Nombre: " + this.getName() + " Apellido:" + this.getLastname() + " Edad:" + this.getAge() + " DNI:"+ this.getDni();
        return dataObj;

    }
}
