package Herencia;
public class Textbook extends Libro {
    /*vars init*/
    String curso;
    /*constructor*/
    public Textbook(String titulo, String autor, double precio, String curso){
        super(titulo, autor, precio);
        this.curso = curso;
    }
    /*método print*/
    public void showtextbook(){
        System.out.println("El título del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El precio del libro es: " + precio);
        System.out.println("El curso al que pertenece el libro es: " + curso);
    }   
}
