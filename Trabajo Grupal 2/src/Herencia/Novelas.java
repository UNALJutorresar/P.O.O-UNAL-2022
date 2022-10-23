
package Herencia;
import java.util.*;
public class Novelas extends Libro {
    String[] tipo={"Histórica", "Romántica", "Policíaca", "Realista", "Ciencia ficción", "Aventuras"};
    public Novelas(String titulo, String autor, double precio, String[] tipo){
        super(titulo, autor, precio);
        System.out.println("Ingrese el tipo de novela del libro, ingresando un numéro correspondiente al género:"+"\n1) Histórica"+"\n2) Romántica"+"\n3) Policiaca"+"\n4)Realista"+"\n5) Ciencia Ficción"+"\n6) Aventuras");
        
    }
    Scanner input = new Scanner(System.in);
    String tipost=tipo[Integer.parseInt(input.next())];
    public void showBook(Libro lib){
        super.showBook(lib);
        System.out.println("El género al que pertenece el libro es: "+tipost);
    }   
    
}
