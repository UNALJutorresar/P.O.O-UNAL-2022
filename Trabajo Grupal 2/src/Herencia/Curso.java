
package Herencia;
import java.util.*;
public class Curso extends Libro {
    String curso;
    public Curso(String titulo, String autor, double precio, String curso){
        super(titulo, autor, precio);
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el curso al que pertenece el libro:");
        curso=input.next();
    }
    public void showBook(Libro lib){
        super.showBook(lib);
        System.out.println("El curso al que pertenece el libro es: "+curso);
    }   
}
