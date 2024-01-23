import java.time.LocalDate;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Alejandro","Antonchuk",24, LocalDate.of(1999,8,25));
        Alumno alumno2 = new Alumno("Lionel", "Messi", 36, LocalDate.of(1987,6,24));
        Alumno alumno3 = new Alumno("Martin", "Palermo", 50, LocalDate.of(1973,11,7));

        alumno3.mostrarDatos();
    }
}