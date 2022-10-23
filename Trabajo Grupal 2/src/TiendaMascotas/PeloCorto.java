package TiendaMascotas;
public class PeloCorto extends Gatos {
    /*vars init*/
    enum raza {AZUL_RUSO,BRITÁNICO,MANX,DEVON_REX};
    /*constructor*/
    public PeloCorto(String nombre, String color, int edad, double jumpH, double jumpL){
        super(nombre, color, edad, jumpH, jumpL);
    } 
}
