package TiendaMascotas;
public class Pequenos extends Perros {
    /*vars init*/
    enum raza {CANICHE,YORKSHIRE_TERRIER,SCHNAUZER,CHIHUAHUA};
    /*constructor*/
    public Pequenos(String nombre, String color, int edad, double peso, boolean muerde){
        super(nombre, color, edad, peso, muerde);
    } 
}
