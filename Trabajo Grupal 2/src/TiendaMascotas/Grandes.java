package TiendaMascotas;
public class Grandes extends Perros {
    /*vars init*/
    enum raza {PASTOR_ALEMAN,DOBERMAN,ROTWEILLER};
    /*constructor*/
    public Grandes(String nombre, String color, int edad, double peso, boolean muerde){
        super(nombre, color, edad, peso, muerde);
    } 
}
