package EjercicioFigs;
import javax.swing.JFrame;
import java.lang.Math;
public class EjercicioFigs {
    public static void main(String[] args) {
        Tab myframe = new Tab();
        myframe.setVisible(true);
    }
    public class Circulo {
 
        public static double calcularArea(double radio) {
         return Math.round(Math.PI*(radio*radio));
         }
    
        public static double calcularPerimetro(double radio) {
         return Math.round(2*(Math.PI*radio));
         }
        }
    public class Rectangulo {
        
        public static double calcularArea(double base, double altura) {
         return base * altura;
         }
        public static double calcularPerimetro(double base, double altura) {
         return (2 * base) + (2 * altura);
         }
        }
    public class Cuadrado {
        
        public static double calcularArea(double lado) {
         return lado*lado;
         }
        public static double calcularPerimetro(double lado) {
         return (4*lado);
         }
     }
    public class TrianguloRectangulo {
        
        public static double calcularArea(double altura, double base) {
         return (base * altura / 2);
         }
        public static double calcularPerimetro(double altura, double base) {
         return Math.round(base + altura + Math.pow(base*base + altura*altura, 0.5));
         }
        public static double calcularHipotenusaPublic(double altura, double base) {
         return Math.round(Math.pow(base*base + altura*altura, 0.5));
         }

        
    }
    public class Rombo {
        
        public static double calcularArea(double diag1, double diag2) {
         return (diag1 * diag2 / 2);
        }
        public static double calcularPerimetro(double diag1, double diag2) {
         return Math.round((2*Math.sqrt((Math.pow(diag1,2)+Math.pow(diag2,2)))));
         }
        }
    public class Trapecio {
        
        public static double calcularArea(double base1, double base2, double altura) {
         return Math.round(base1+base2 / 2)*altura;
        }
        public static double calcularPerimetro(double base1, double base2, double lado1, double lado2) {
         return (base1+base2+lado1+lado2);
         }
        }
}
