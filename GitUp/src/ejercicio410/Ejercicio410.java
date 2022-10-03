package ejercicio410;

public class Ejercicio410 {

    public static void main(String[] args) {
        Tab myframe = new Tab();
        myframe.setVisible(true);
    }
    
    public static double cobro(double patrimonio, int estrato) {
        double cobro;
        if((patrimonio>2000000)&(estrato>3)){
            cobro = 50000+(patrimonio*0.03);
        }
        else{
        cobro = 50000;
            }
        return cobro;
    }
}
