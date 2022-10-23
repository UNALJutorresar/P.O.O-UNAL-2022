package TiendaMascotas;
public class PeloLargo extends Gatos {
    /*vars init*/
    enum raza {ANGORA,HIMALAYO,BALINES,SOMALI};
    /*constructor*/
    public PeloLargo(String nombre, String color, int edad, double jumpH, double jumpL){
        super(nombre, color, edad, jumpH, jumpL);
    } 
}
