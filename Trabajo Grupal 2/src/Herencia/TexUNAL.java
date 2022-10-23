
package Herencia;
import java.util.*;
public class TexUNAL extends Curso {
    String facultad;
    public TexUNAL (String titulo, String autor, double precio, String curso){
        super(titulo, autor, precio, curso);
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la facultad que publicó el libro:");
        facultad=input.next();
    }
    public void showBook(Libro lib){
        super.showBook(lib);
        System.out.println("La facultad que publicó el libro es: "+facultad);
    }   
    
}
