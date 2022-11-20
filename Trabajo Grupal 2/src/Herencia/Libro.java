package Herencia;
public class Libro {
    /*vars init*/
    protected String titulo; 
    protected String autor;
    protected double precio;
    /*constructor*/
    public Libro(String titulo, String autor, double precio){
        this.autor=autor;
        this.titulo=titulo;
        this.precio=precio;
    }
    /*método print*/
    public void showbook(){
        System.out.println("El título del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El precio del libro es: " + precio);
    }
}
