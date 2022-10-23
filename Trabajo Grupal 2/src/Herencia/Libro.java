
package Herencia;
import java.util.*;
public class Libro {

    protected String titulo; 
    protected String autor;
    protected double precio;
    
    public Libro(String titulo, String autor, double precio){
        this.autor=autor;
        this.titulo=titulo;
        this.precio=precio;
    }
    
    public void setATP(String x, String y, double z){
        this.titulo=x;
        this.autor=y;
        this.precio=z;
    }
    public void setupBook(Libro lib){
        Scanner input = new Scanner(System.in);
        String aut;
        String tit;
        double pri;
        System.out.println("Ingrese el Titulo del Libro");
        aut=input.next();
        System.out.println("Ingrese el Autor del Libro");
        tit=input.next();
        System.out.println("Ingrese el Precio del Libro");
        pri=input.nextDouble();
        lib.setATP(aut,tit, pri);
    }
    public void showBook(Libro lib){
        System.out.println("El título del libro es: "+lib.titulo);
        System.out.println("El autor del libro es: "+lib.autor);
        System.out.println("El precio del libro es: "+lib.precio);
    }

 
}
