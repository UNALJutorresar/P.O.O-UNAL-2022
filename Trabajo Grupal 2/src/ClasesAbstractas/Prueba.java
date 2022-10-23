
package ClasesAbstractas;
import java.util.*;
public class Prueba  {
    public static void main(String args[]){
        int numer, denom, objectifywomen;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor del numerador:");
        numer=Integer.parseInt(input.next());
        System.out.println("Ingrese el valor del denominador:");
        denom=Integer.parseInt(input.next());
        System.out.println("Ingrese el valor del Objeto (Para comparaciones):");
        objectifywomen=Integer.parseInt(input.next());
       
        Fraccion abc=new Fraccion();
        System.out.println(abc.getString(numer, denom));
        System.out.println(abc.equals(numer, denom, objectifywomen));
        System.out.println(abc.multiplicar(denom, numer));
        System.out.println(abc.dividir(numer, denom));
        System.out.println(abc.sumar(numer, denom));
        System.out.println(abc.restar(numer, denom));
     
   
        
    }
    
}
