package TiendaMascotas;
public class Medianos extends Perros {
    /*vars init*/
    enum raza {COLLIE,DALMATA,BULLDOG,GALGO,SABUESO};
    /*constructor*/
    public Medianos(String nombre, String color, int edad, double peso, boolean muerde){
        super(nombre, color, edad, peso, muerde);
    } 
}
