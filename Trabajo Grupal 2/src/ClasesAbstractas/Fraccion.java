package ClasesAbstractas;
import java.util.*;
public class Fraccion extends Numerica {
    int a, b;
    
    public String getString(int a, int b){
        return "El valor String del numero es: "+String.valueOf(a+"/"+b);
    }
    public boolean equals(int a, int b, int ob){
        
        if (a==ob){
            System.out.println("El numerador es igual al objeto");
            return true;
        }
        else if (b==ob){
            System.out.println("El denominador es igual al objeto");
            return true;
        }
        else if (b==ob && a==ob){
           System.out.println("Tanto el denominador como el numerador son iguales al objeto");
            return true;
        }
        else{
            System.out.println("Ni el denominador ni el numerador son iguales al objeto");
            return false;
        }
    }
    public int sumar(int a, int b){
        return a+b;
    }  
   public int restar(int a, int b){
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
   public int multiplicar(int a, int b){
       return a*b;
   }
   public int dividir(int a, int b){
        if (a>b){
           return a/b;
       }
       else if (a<b){
           return b/a;
       }
       else{
           return a/b;
       }
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
