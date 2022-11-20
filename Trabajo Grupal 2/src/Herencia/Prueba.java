package Herencia;
import java.util.*;
public class Prueba {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el Titulo del Libro");
        String titulo = input.next();
        System.out.println("Ingrese el Autor del Libro");
        String autor = input.next();
        System.out.println("Ingrese el Precio del Libro");
        float precio = input.nextFloat();
        Libro libro = new
            Libro(titulo,autor,precio);
        libro.showbook();
        
        System.out.println("Ingrese el curso al que pertenece el libro:");
        String curso = input.next();
        Textbook textbook = new
            Textbook(titulo,autor,precio,curso);
        textbook.showtextbook();
        
        System.out.println("Ingrese la facultad que publicó el libro:");
        String facultad = input.next();
        TexUNAL texunal = new
            TexUNAL(titulo,autor,precio,curso,facultad);
        texunal.showtexunal();
        
        System.out.println("Ingrese el género de novela del libro: Histórica, Romántica, Policíaca, Realista, Ciencia Ficción, Aventuras");
        String genero = input.next();
        Novelas novela = new
            Novelas(titulo,autor,precio,genero);
        novela.shownovel();
    }
}
