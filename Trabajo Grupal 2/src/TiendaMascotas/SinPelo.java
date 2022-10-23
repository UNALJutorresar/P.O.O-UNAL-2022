package TiendaMascotas;
public class SinPelo extends Gatos {
    /*vars init*/
    enum raza {ESFINGE,ELFO,DONSKOY};
    /*constructor*/
    public SinPelo(String nombre, String color, int edad, double jumpH, double jumpL){
        super(nombre, color, edad, jumpH, jumpL);
    } 
}
