package ejercicio540;

import java.lang.Math;

public class Ejercicio540 {
    
    void main(String[] args) {
        Tab myframe = new Tab();
        myframe.setVisible(true);
    }
    
    public static double[] transform(String userinput){
            String[] split=userinput.split(",");
            double[] array=new double[split.length];
            for (int i=0; i<split.length; i++){
                array[i]=Double.parseDouble(split[i]);
            }
            return array;
    }

   public static double[] raiz(double[] array){
            double[] sqrtarray=new double[array.length];
            for (int i=0; i<array.length; i++){
                sqrtarray[i]=Math.sqrt(array[i]);
            }
            return sqrtarray;
    }
     public static double[] cuadrado(double[] array){
            double[] powarray=new double[array.length];
            for (int i=0; i<array.length; i++){
                powarray[i]=Math.pow(array[i], 2);
            }
            return powarray;
    }
    public static double[] cubo(double[] array){
            double[] cubearray=new double[array.length];
            for (int i=0; i<array.length; i++){
                cubearray[i]=Math.pow(array[i], 3);
            }
            return cubearray;
    }
}
