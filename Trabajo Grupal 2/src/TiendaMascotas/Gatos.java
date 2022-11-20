package TiendaMascotas;
public class Gatos extends Mascota {
    /*vars init*/
    double jumpH;
    double jumpL;
    /*constructor*/
    public Gatos(String nombre, String color, int edad, double jumpH, double jumpL){
        super(nombre, color, edad);
        this.jumpH = jumpH;
        this.jumpL = jumpL;
    }
    /*único método pedido en el enunciado*/
    protected static void sonido(){
        System.out.println("Los gatos maullan y ronronean");
    } 
}
