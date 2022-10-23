package Herencia;
public class TexUNAL extends Textbook {
    /*vars init*/
    String facultad;
    /*constructor*/
    public TexUNAL (String titulo, String autor, double precio, String curso, String facultad){
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }
    /*método print*/
    public void showtexunal(){
        System.out.println("El título del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El precio del libro es: " + precio);
        System.out.println("El curso al que pertenece el libro es: " + curso);
        System.out.println("La facultad que publicó el libro es: "+ facultad);
    }   
}
