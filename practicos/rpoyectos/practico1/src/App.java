import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejemplo manejo de fechas:");
        LocalDate myBirthDate = LocalDate.of(2000, Month.JANUARY, 24);
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
    
        System.out.println("Es mi cumpleaños?");
        System.out.println(myBirthDate.getDayOfMonth() == currentDate.getDayOfMonth());
        

    
    }
}
