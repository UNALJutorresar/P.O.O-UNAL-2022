package ejercicio423;

import java.lang.Math;

public class Ejercicio423 {

    public static void main(String[] args) {
        Tab myframe = new Tab();
        myframe.setVisible(true);
    }
    
    public static String soluciones(double a, double b, double c) {
        double ans1, ans2;
        if(Math.pow(b,2)-4*a*c > 0){
            ans1 =(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
            ans2 =(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
            return "Dos soluciones: "+ans1+" y "+ans2;
        }
        else if (Math.pow(b,2)-4*a*c == 0) {
            ans1 =(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
            return "Una solucion: "+ans1;
        }
        else{
            return "Sin respuesta en los reales";
        }
    }
}
