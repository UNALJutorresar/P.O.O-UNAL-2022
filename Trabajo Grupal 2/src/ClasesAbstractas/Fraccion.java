package ClasesAbstractas;
import java.util.*;
public class Fraccion extends Numerica {
    double a, b;
    
    public String getString(double a, double b){
        return "El valor String del numero es: "+String.valueOf(a+"/"+b);
    }
    public String equals(double a, double b, double ob){
        
        if (a==ob){
            return "El numerador es igual al objeto";
        }
        else if (b==ob){
            return "El denominador es igual al objeto";
        }
        else if (b==ob && a==ob){
           return "Tanto el denominador como el numerador son iguales al objeto";
        }
        else{
            return "Ni el denominador ni el numerador son iguales al objeto";
        }
    }
    public double sumar(double a, double b){
        return a+b;
    }  
   public double restar(double a, double b){
       if (a>b){
           return a-b;
       }
       else if (a<b){
           return b-a;
       }
       else{
           return a-b;
       }
   }
   public double multiplicar(double a, double b){
       return a*b;
   }
   public double dividir(double a, double b){
           return a/b;
   }

    @Override
    public String getString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean equals(Object ob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Numerica sumar(Numerica num) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Numerica restar(Numerica num) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Numerica multiplicar(Numerica num) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Numerica dividir(Numerica num) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
