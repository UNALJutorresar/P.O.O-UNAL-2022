package TiendaMascotas;
public class Perros extends Mascota {
    /*vars init*/
    double peso;
    boolean muerde;
    /*constructor*/
    public Perros(String nombre, String color, int edad, double peso, boolean muerde){
        super(nombre, color, edad);
        this.peso = peso;
        this.muerde = muerde;
    }
    /*único método pedido en el enunciado*/
    protected static void sonido(){
        System.out.println("Los perros ladran");
    } 
}
