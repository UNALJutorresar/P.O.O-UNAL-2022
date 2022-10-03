package ejercicio422;

public class Ejercicio422 {

    public static void main(String[] args) {
        Tab myframe = new Tab();
        myframe.setVisible(true);
    }

    public static double salario(double trabajo, double basico) {
        double mensual;
        mensual = trabajo*basico;
        if(mensual>450000){
            return mensual;
        }
        else{
            return 0;
        }
    }
}
