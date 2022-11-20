package Herencia;
public class Novelas extends Libro {
    /*vars init*/
    String genero;
    /*constructor*/
    public Novelas(String titulo, String autor, double precio,String genero){
        super(titulo, autor, precio);
        this.genero = genero;
    }
    /*método print*/
    public void shownovel(){
        System.out.println("El título del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El precio del libro es: " + precio);
        System.out.println("El género al que pertenece el libro es: " + genero);
    }
}