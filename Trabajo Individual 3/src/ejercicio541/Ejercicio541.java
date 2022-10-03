package ejercicio541;

public class Ejercicio541 {

    public static void main(String[] args) {
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
    
    public static double[] sorter(double[] array){
        double n=array.length, temp=0;
            for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                        if(array[j-1] > array[j]){   
                            temp = array[j-1];  
                            array[j-1] = array[j];  
                            array[j] = temp;  
                          }
                 }
             }
            return array;
        }
}
